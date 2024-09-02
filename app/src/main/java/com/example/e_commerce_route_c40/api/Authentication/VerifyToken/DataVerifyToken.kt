package com.example.e_commerce_route_c40.api.Authentication.VerifyToken

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataVerifyToken(

	@field:SerializedName("decoded")
	val decoded: Decoded? = null,

	@field:SerializedName("message")
	val message: String? = null
) : Parcelable