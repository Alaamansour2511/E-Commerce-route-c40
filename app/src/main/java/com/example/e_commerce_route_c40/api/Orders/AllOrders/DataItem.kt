package com.example.e_commerce_route_c40.api.Orders.AllOrders

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataItem(

    @field:SerializedName("totalOrderPrice")
	val totalOrderPrice: Int? = null,

    @field:SerializedName("isPaid")
	val isPaid: Boolean? = null,

    @field:SerializedName("isDelivered")
	val isDelivered: Boolean? = null,

    @field:SerializedName("createdAt")
	val createdAt: String? = null,

    @field:SerializedName("shippingPrice")
	val shippingPrice: Int? = null,

    @field:SerializedName("shippingAddress")
	val shippingAddress: ShippingAddress? = null,

    @field:SerializedName("taxPrice")
	val taxPrice: Int? = null,

    @field:SerializedName("paidAt")
	val paidAt: String? = null,

    @field:SerializedName("_id")
	val id: String? = null,

    @field:SerializedName("id")
	val id: Int? = null,

    @field:SerializedName("cartItems")
	val cartItems: List<CartItemsItem?>? = null,

    @field:SerializedName("paymentMethodType")
	val paymentMethodType: String? = null,

    @field:SerializedName("user")
	val user: User? = null,

    @field:SerializedName("updatedAt")
	val updatedAt: String? = null
) : Parcelable