package com.example.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.material.TopAppBar

class CardListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardListContent()
        }
    }
}

@Composable
fun CardListContent() {
    RecipeList(recipes = recipeList)
}

@Composable
fun RecipeList(recipes: List<Recipe>) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(title = { Text(text = "Recipes") })
        VerticalScroller(modifier = Modifier.weight(1f)) {
            Column {
                recipes.forEach {
                    RecipeCard(recipe = it)
                }
            }
        }
    }
}