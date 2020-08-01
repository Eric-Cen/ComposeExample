package com.example.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.TopAppBar

class BottomBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomBarContent()
        }
    }
}

@Composable
fun BottomBarContent() {
    Column {
        TopAppBar(title = { Text(text = "BottomBar") })
        Text("BottomBar Activity ... to implement")
    }
}