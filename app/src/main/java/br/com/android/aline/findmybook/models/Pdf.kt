package br.com.android.aline.findmybook.models


import com.google.gson.annotations.SerializedName

data class Pdf(

	@field:SerializedName("isAvailable")
	val isAvailable: Boolean? = null,

	@field:SerializedName("acsTokenLink")
	val acsTokenLink: String? = null
)