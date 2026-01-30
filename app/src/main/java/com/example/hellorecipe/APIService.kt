package com.example.hellorecipe

import retrofit2.http.GET

interface APIService{
    // this sends the http request to the server/API with the url
    @GET("categories.php") // we are sending request to categories.php file
    suspend fun getCategories(): CategoriesResponse
}