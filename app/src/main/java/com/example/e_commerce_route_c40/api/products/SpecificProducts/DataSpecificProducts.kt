package com.example.e_commerce_route_c40.api.products.SpecificProducts

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataSpecificProducts(

	@field:SerializedName("data")
	val data: Data? = null
) : Parcelable