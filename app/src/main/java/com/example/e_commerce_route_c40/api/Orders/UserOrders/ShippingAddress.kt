package com.example.e_commerce_route_c40.api.Orders.UserOrders

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ShippingAddress(

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("details")
	val details: String? = null,

	@field:SerializedName("phone")
	val phone: String? = null,

	@field:SerializedName("postalCode")
	val postalCode: String? = null
) : Parcelable