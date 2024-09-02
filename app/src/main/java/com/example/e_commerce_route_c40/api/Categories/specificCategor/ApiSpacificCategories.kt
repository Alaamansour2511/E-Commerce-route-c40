package com.example.e_commerce_route_c40.api.Categories.specificCategor

import com.example.e_commerce_route_c40.api.Categories.AllCategories.Categories
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiSpacificCategories {

        @GET("/api/v1/categories")
        fun getAllCategories(@Query("apiKey") apiKey: String?=null
        ): Call<SpacificCategories>
}