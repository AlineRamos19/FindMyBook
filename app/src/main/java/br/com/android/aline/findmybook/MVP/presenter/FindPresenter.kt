package br.com.android.aline.findmybook.MVP.presenter

import br.com.android.aline.findmybook.MVP.view.FindView


interface FindPresenter {
    val findView  : FindView
    fun checkNetwork() : Boolean

}