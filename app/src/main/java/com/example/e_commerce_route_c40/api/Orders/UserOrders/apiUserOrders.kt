package com.example.e_commerce_route_c40.api.Orders.UserOrders

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface apiUserOrders {
@GET("/api/v1/orders")
fun getUserOrders(@Query("apiKey") apiKey: String? = null): Call<DataUserOrders>

}