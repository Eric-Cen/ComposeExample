package com.example.composeexample

import androidx.annotation.DrawableRes

data class Recipe(
    @DrawableRes val imageResource: Int,
    val title: String,
    val ingredients: List<String>
)

val recipeList = listOf(
    Recipe(R.drawable.chicken_noodle_soup, "Chicken Noodle Soup", listOf("onion", "carrot", "celery", "pepper", "egg noodle", "chicken broth")),
    Recipe(R.drawable.pineapple_fried_rice, "Pineapple Fried Rice", listOf("coconut oil", "egg", "pineapple", "red bell pepper", "green onion", "cashews", "brown rice", "soy sauce", "lime")),
    Recipe(R.drawable.congee, "Congee", listOf("rice", "chicken", "ginger",  "garlic cloves", "spring onion", "coriander", "egg")),
    Recipe(R.drawable.crab_cake, "Crab Cake", listOf("egg", "mayonnaise", "mustard", "crabmeat", "butter", "Worcestershire sauce", "parsley")),
    Recipe(R.drawable.lobster_with_onion, "Lobster with onions", listOf("lobster", "ginger", "scallion", "salt", "sugar", "cornstarch", "vegetable oil"))
)