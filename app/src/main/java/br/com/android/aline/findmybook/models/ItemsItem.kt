package br.com.android.aline.findmybook.models


import com.google.gson.annotations.SerializedName


data class ItemsItem(

	@field:SerializedName("saleInfo")
	val saleInfo: SaleInfo? = null,

	@field:SerializedName("searchInfo")
	val searchInfo: SearchInfo? = null,

	@field:SerializedName("kind")
	val kind: String? = null,

	@field:SerializedName("volumeInfo")
	val volumeInfo: VolumeInfo? = null,

	@field:SerializedName("etag")
	val etag: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("accessInfo")
	val accessInfo: AccessInfo? = null,

	@field:SerializedName("selfLink")
	val selfLink: String? = null
)