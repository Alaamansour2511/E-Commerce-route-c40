package com.example.e_commerce_route_c40.api.Categories.AllCategories

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiAllCategories {

    @GET("/api/v1/categories")
    fun getAllCategories(@Query("apiKey") apiKey: String?=null
    ): Call<Categories>

}