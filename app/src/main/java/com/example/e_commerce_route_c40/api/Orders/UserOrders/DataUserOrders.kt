package com.example.e_commerce_route_c40.api.Orders.UserOrders

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataUserOrders(

	@field:SerializedName("DataUserOrders")
	val dataUserOrders: List<DataUserOrdersItem?>? = null
) : Parcelable