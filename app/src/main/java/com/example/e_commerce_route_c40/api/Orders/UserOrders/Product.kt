package com.example.e_commerce_route_c40.api.Orders.UserOrders

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(

	@field:SerializedName("imageCover")
	val imageCover: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("subcategory")
	val subcategory: List<SubcategoryItem?>? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("category")
	val category: Category? = null,

	@field:SerializedName("ratingsQuantity")
	val ratingsQuantity: Int? = null,

	@field:SerializedName("brand")
	val brand: Brand? = null,

	@field:SerializedName("ratingsAverage")
	val ratingsAverage: Double? = null
) : Parcelable