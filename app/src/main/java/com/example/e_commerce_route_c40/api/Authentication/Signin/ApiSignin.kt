package com.example.e_commerce_route_c40.api.Authentication.Signin

import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

    interface apiSignin {
        @POST("/api/v1/auth/signin")
        fun getAllSignin(@Query("apiKey") apiKey: String? = null): Call<DataSignin>

}