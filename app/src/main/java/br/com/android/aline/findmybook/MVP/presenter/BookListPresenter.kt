package br.com.android.aline.findmybook.MVP.presenter

import br.com.android.aline.findmybook.MVP.view.BookListView
import br.com.android.aline.findmybook.models.Data


interface BookListPresenter {

    val bookListView : BookListView

    fun sendTextUser()

    fun getListBook(dataBook : Data?)









}