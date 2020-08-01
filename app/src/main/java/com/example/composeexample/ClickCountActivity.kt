package com.example.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.material.TopAppBar
import androidx.ui.unit.dp

class ClickCountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickCountContent()
        }
    }
}

@Composable
fun ClickCountContent() {
    val counterState = state { 0 }

    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.weight(1f)) {
            TopAppBar(title = { Text("Click & Count") })

            Text(text = "value = ${counterState.value}")
            Counter(
                count = counterState.value,
                updateCount = { newCount ->
                    counterState.value = newCount
                })
        }

    }
}

@Composable
fun Counter(count: Int, updateCount: (Int) -> Unit) {
    Button(
        modifier = Modifier.padding(top = 64.dp),
        onClick = { updateCount(count + 1) },
        backgroundColor = if (count > 5) Color.Green else Color.Blue
    ) {
        Text("I've been clicked $count times")
    }
}