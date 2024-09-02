package com.example.e_commerce_route_c40.api.Authentication.VerifyToken

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Decoded(

	@field:SerializedName("role")
	val role: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("exp")
	val exp: Int? = null,

	@field:SerializedName("iat")
	val iat: Int? = null
) : Parcelable