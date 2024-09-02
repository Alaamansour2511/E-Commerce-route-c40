package com.example.e_commerce_route_c40.api.Brands.SpecificBrands


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiSpecificBrands {

    @GET("/api/v1/subcategories")
    fun getAllBrands(@Query("apiKey") apiKey: String?=null
    ): Call<Response>

}