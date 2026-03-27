package com.example.hellorecipe

import retrofit2.http.GET

interface APIService {
    @GET("categories.php")
    suspend fun getCategories() : CategoriesResponse
}