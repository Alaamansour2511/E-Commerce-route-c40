package com.example.e_commerce_route_c40.api.subcategories.AllSubCategories


import retrofit2.http.GET
import retrofit2.http.Query

interface ApiAllSubCategories {

    @GET("/api/v1/subcategories")
    fun getAllSubCategories(@Query("apiKey") apiKey: String?=null
    )

}