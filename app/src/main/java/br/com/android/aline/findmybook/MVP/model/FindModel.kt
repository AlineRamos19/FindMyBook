package br.com.android.aline.findmybook.MVP.model

import android.content.Context


interface FindModel {

    val context : Context
    fun checkNetworkOpen () : Boolean
}