package com.example.e_commerce_route_c40.api.subcategories.SpecificSubCategory

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
	val createdAt: String? = null,
	val V: Int? = null,
	val name: String? = null,
	val id: String? = null,
	val category: String? = null,
	val slug: String? = null,
	val updatedAt: String? = null
) : Parcelable