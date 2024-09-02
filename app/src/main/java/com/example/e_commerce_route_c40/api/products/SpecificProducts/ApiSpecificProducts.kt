package com.example.e_commerce_route_c40.api.products.SpecificProducts

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface apiAllProducts {
@GET("/api/v1/products")
fun getAllproducts (@Query("apiKey") apiKey:String?=null)
: Call<DataSpecificProducts>

}