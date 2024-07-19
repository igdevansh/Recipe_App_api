package com.example.recipe_app_api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

data class Catogory(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

data class CategoriesResponse(val categories: List<Catogory>)
