package com.example.e_commerce_route_c40.api.Brands.SpecificBrands

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Response(

	@field:SerializedName("data")
	val data: Data? = null
) : Parcelable