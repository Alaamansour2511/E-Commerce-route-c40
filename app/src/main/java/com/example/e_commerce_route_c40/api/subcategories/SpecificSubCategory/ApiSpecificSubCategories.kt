package com.example.e_commerce_route_c40.api.subcategories.SpecificSubCategory

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiSpecificSubCategories {

    @GET("/api/v1/subcategories")
    fun getSpecificSubCategory(@Query("apiKey") apiKey: String?=null
    ): Call<SpecificSubCategory>

}