package com.example.e_commerce_route_c40.api.Authentication.GetAllUser

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataResetAllUser(

	@field:SerializedName("metadata")
	val metadata: Metadata? = null,

	@field:SerializedName("totalUsers")
	val totalUsers: Int? = null,

	@field:SerializedName("users")
	val users: List<UsersItem?>? = null
) : Parcelable