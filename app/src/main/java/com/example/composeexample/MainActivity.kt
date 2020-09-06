package com.example.composeexample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.padding
import androidx.ui.material.*
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.composeexample.ui.ComposeExampleTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MyScreenContent2()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable() () -> Unit) {
    ComposeExampleTheme {
        //Surface(color = Color.Yellow) {
        content()
        //}
    }
}

@Composable
fun MyScreenContent2() {
    Column(modifier = Modifier.fillMaxSize()) {
        val context = ContextAmbient.current
        TopAppBar(title = { Text(text = "JetPack Compose") })
        VerticalScroller {
            Column(modifier = Modifier.fillMaxSize()) {
                Button(
                    modifier = Modifier.gravity(Alignment.CenterHorizontally)
                        .padding(16.dp)
                        .padding(top = 32.dp),
                    shape = CircleShape,
                    onClick = {
                        context.startActivity(Intent(context, TextStyleActivity::class.java))
                    }) {
                    Text(text = "Text with styles")
                }
                Button(
                    modifier = Modifier.gravity(Alignment.CenterHorizontally)
                        .padding(16.dp),
                    shape = CircleShape,
                    onClick = {
                        context.startActivity(Intent(context, ClickCountActivity::class.java))
                    }) {
                    Text(text = "Click & count")
                }
                Button(
                    modifier = Modifier.gravity(Alignment.CenterHorizontally)
                        .padding(16.dp),
                    shape = CircleShape,
                    onClick = {
                        context.startActivity(Intent(context, CardListActivity::class.java))
                    }) {
                    Text(text = "CardView")
                }
                Button(
                    modifier = Modifier.gravity(Alignment.CenterHorizontally)
                        .padding(16.dp),
                    shape = CircleShape,
                    onClick = {
                        context.startActivity(Intent(context, AppBarActivity::class.java))
                    }) {
                    Text(text = "TopAppBar")
                }
                Button(
                    modifier = Modifier.gravity(Alignment.CenterHorizontally)
                        .padding(16.dp),
                    shape = CircleShape,
                    onClick = {
                        context.startActivity(Intent(context, BottomBarActivity::class.java))
                    }) {
                    Text(text = "BottomBar")
                }
                Button(
                    modifier = Modifier.gravity(Alignment.CenterHorizontally)
                        .padding(16.dp),
                    shape = CircleShape,
                    onClick = {
                        Toast.makeText(context, "to implement...", Toast.LENGTH_SHORT).show()

                    }) {
                    Text(text = "add more...")
                }
            }
        }
    }
}

@Preview("MyScreen preview")
@Composable
fun DefaultPreview() {
    MyScreenContent2()
}