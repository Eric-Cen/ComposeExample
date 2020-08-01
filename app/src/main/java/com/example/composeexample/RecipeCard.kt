package com.example.composeexample

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.height
import androidx.ui.layout.padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Composable
fun RecipeCard(recipe: Recipe) {
    Surface(shape = RoundedCornerShape(8.dp),
    elevation = 8.dp,
    modifier = Modifier.padding(16.dp)) {
        Column {
            Image(
                asset = imageResource(id = recipe.imageResource),
                modifier = Modifier.fillMaxWidth() +
                        Modifier.height(144.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                recipe.title,
                style = TextStyle(
                    fontSize = MaterialTheme.typography.h4.fontSize,
                    fontStyle = MaterialTheme.typography.h4.fontStyle
                ),
                modifier = Modifier.padding(start = 16.dp)
            )
            for (ingredient in recipe.ingredients) {
                Text(
                    text = "• $ingredient",
                    modifier = Modifier.padding(start = 16.dp),
                    style = MaterialTheme.typography.subtitle1
                )
            }
        }
    }
}