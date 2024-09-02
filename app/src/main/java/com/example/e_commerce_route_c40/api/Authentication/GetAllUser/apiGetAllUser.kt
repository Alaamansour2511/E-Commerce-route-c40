package com.example.e_commerce_route_c40.api.Authentication.GetAllUser

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface apiGetAllUser {
    @GET("/api/v1/users")
        fun getAllResetUsers(@Query("apiKey") apiKey:String? = null):
                Call <DataResetAllUser>
    }



