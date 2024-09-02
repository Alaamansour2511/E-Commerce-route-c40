package com.example.e_commerce_route_c40.api.Brands.AllBrands


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiAllBrands {

    @GET("/api/v1/subcategories")
    fun getAllBrands(@Query("apiKey") apiKey: String?=null
    ): Call<AllBrandsData>

}