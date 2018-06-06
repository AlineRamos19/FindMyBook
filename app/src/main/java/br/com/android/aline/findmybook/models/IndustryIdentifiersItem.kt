package br.com.android.aline.findmybook.models


import com.google.gson.annotations.SerializedName


data class IndustryIdentifiersItem(

	@field:SerializedName("identifier")
	val identifier: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)