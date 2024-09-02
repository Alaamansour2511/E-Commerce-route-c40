package com.example.e_commerce_route_c40.api

import android.util.Log
import com.example.e_commerce_route_c40.api.Categories.AllCategories.ApiAllCategories
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiManager {
 var retrofit:Retrofit  ?=null
init {
    buildRetrofit()
}

    private  fun  provideLoggingInterceptor():HttpLoggingInterceptor{
        val loggingInterceptor=HttpLoggingInterceptor{

            Log.e("api->"   ,  it)
        }
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return loggingInterceptor    }


    private fun provideHttpClient():OkHttpClient{

        return OkHttpClient.Builder()
            .addInterceptor(provideLoggingInterceptor())
            .build()
    }
    private fun buildRetrofit():Retrofit {
        if (retrofit==null){
            retrofit=Retrofit.Builder()
                .client(provideHttpClient())
                .baseUrl("https://ecommerce.routemisr.com")
                .addConverterFactory(GsonConverterFactory.
                create()).build()
        }
        return retrofit!!


    }

    fun getcategries(): ApiAllCategories {
    return buildRetrofit().create(ApiAllCategories::class.java)

}




}