package br.com.android.aline.findmybook.models

import com.google.gson.annotations.SerializedName

data class SearchInfo(

	@field:SerializedName("textSnippet")
	val textSnippet: String? = null
)