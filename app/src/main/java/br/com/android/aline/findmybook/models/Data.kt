package br.com.android.aline.findmybook.models


import com.google.gson.annotations.SerializedName

data class Data(

	@field:SerializedName("totalItems")
	val totalItems: Int? = null,

	@field:SerializedName("kind")
	val kind: String? = null,

	@field:SerializedName("items")
	val items: List<ItemsItem?>? = null
)