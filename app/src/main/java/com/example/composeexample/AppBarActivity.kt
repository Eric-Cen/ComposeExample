package com.example.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.TopAppBar

class AppBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppBarContent()
        }
    }
}

@Composable
fun AppBarContent() {
    Column {
        TopAppBar(title = { Text(text = "AppBar") })
        Text("AppBar Activity...to implement")
    }

}