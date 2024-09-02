package com.example.e_commerce_route_c40.api.Categories.specificCategor

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SpacificCategories(

	@field:SerializedName("metadata")
	val metadata: Metadata? = null,

	@field:SerializedName("data")
	val data: List<String?>? = null,

	@field:SerializedName("results")
	val results: Int? = null
) : Parcelable