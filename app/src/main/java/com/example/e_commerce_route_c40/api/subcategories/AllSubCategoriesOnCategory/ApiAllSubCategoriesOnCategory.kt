package com.example.e_commerce_route_c40.api.subcategories.AllSubCategoriesOnCategory

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiAllSubCategoriesOnCategory {

    @GET("/api/v1/subcategories")
    fun getAllCategoriesOnCategory(@Query("apiKey") apiKey: String?=null
    ): Call<AllSubCategoriesOnServer>

}