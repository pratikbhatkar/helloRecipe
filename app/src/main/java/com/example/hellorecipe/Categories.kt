package com.example.hellorecipe

data class Category(
    val idCategory : String,
    val strCategory : String,
    val strCategoryThumb : String,
    val strCategoryDescription : String
)
data class CategoriesList(
    val categories : List<Category>
)