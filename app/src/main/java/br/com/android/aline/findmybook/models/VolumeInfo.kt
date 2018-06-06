package br.com.android.aline.findmybook.models

import com.google.gson.annotations.SerializedName

data class VolumeInfo(

	@field:SerializedName("industryIdentifiers")
	val industryIdentifiers: List<IndustryIdentifiersItem?>? = null,

	@field:SerializedName("pageCount")
	val pageCount: Int? = null,

	@field:SerializedName("printType")
	val printType: String? = null,

	@field:SerializedName("readingModes")
	val readingModes: ReadingModes? = null,

	@field:SerializedName("previewLink")
	val previewLink: String? = null,

	@field:SerializedName("canonicalVolumeLink")
	val canonicalVolumeLink: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("language")
	val language: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("imageLinks")
	val imageLinks: ImageLinks? = null,

	@field:SerializedName("panelizationSummary")
	val panelizationSummary: PanelizationSummary? = null,

	@field:SerializedName("publisher")
	val publisher: String? = null,

	@field:SerializedName("publishedDate")
	val publishedDate: String? = null,

	@field:SerializedName("categories")
	val categories: List<String?>? = null,

	@field:SerializedName("maturityRating")
	val maturityRating: String? = null,

	@field:SerializedName("allowAnonLogging")
	val allowAnonLogging: Boolean? = null,

	@field:SerializedName("contentVersion")
	val contentVersion: String? = null,

	@field:SerializedName("authors")
	val authors: List<String?>? = null,

	@field:SerializedName("infoLink")
	val infoLink: String? = null,

	@field:SerializedName("subtitle")
	val subtitle: String? = null,

	@field:SerializedName("averageRating")
	val averageRating: Double? = null,

	@field:SerializedName("ratingsCount")
	val ratingsCount: Int? = null
)