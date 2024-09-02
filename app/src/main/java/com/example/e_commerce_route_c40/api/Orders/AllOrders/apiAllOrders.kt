package com.example.e_commerce_route_c40.api.Orders.AllOrders

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface apiAllOrders {
    @GET("/api/v1/orders/")
    fun getAllOrders(@Query("apiKey") apiKey:String?=null): Call<DataAllOrders>

}