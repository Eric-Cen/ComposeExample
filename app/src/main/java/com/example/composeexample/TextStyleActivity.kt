package com.example.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.unit.dp

class TextStyleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextStyleContent()
        }
    }
}

@Composable
fun TextStyleContent() {
    Column {
        TopAppBar(title = { Text("Text Styles") })
        VerticalScroller {
            Column {
                Text(
                    text = "typography.h4",
                    style = MaterialTheme.typography.h4,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = "typography.h6",
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = "typography.subtitle1",
                    style = MaterialTheme.typography.subtitle1,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = "typography.subtitle2",
                    style = MaterialTheme.typography.subtitle2,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = "typography.body1",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = "typography.body2",
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}