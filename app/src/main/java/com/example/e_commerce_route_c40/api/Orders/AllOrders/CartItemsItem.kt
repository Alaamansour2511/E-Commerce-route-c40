package com.example.e_commerce_route_c40.api.Orders.AllOrders

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CartItemsItem(

    @field:SerializedName("product")
	val product: Product? = null,

    @field:SerializedName("price")
	val price: Int? = null,

    @field:SerializedName("count")
	val count: Int? = null,

    @field:SerializedName("_id")
	val id: String? = null
) : Parcelable