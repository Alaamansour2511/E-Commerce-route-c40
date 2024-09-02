package com.example.e_commerce_route_c40.api.Authentication.VerifyToken

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface apiVerifyToken {

    @GET("/api/v1/auth/verify-token")
    fun grtVerifyToken(@Query("apiKey")apiKey:String ?=null): Call <DataVerifyToken>


}