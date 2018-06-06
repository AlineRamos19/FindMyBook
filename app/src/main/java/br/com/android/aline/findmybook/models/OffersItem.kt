package br.com.android.aline.findmybook.models


import com.google.gson.annotations.SerializedName

data class OffersItem(

	@field:SerializedName("finskyOfferType")
	val finskyOfferType: Int? = null,

	@field:SerializedName("retailPrice")
	val retailPrice: RetailPrice? = null,

	@field:SerializedName("listPrice")
	val listPrice: ListPrice? = null,

	@field:SerializedName("giftable")
	val giftable: Boolean? = null
)