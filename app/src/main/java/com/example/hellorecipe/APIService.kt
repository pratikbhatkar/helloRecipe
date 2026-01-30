package com.example.hellorecipe

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder().baseUrl("www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create()).build()

val recipeService = retrofit.create(APIService::class.java)

interface APIService{
    // this sends the http request to the server/API with the url
    @GET("categories.php") // we are sending request to categories.php file
    suspend fun getCategories(): CategoriesResponse
}