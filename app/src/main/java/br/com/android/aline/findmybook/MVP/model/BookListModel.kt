package br.com.android.aline.findmybook.MVP.model


interface BookListModel {

    fun getBookService()
    fun getText(query : String)

}