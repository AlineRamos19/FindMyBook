package br.com.android.aline.findmybook.MVP.presenter

import android.content.Context
import br.com.android.aline.findmybook.MVP.model.BookListModel
import br.com.android.aline.findmybook.MVP.model.BookListModelImpl
import br.com.android.aline.findmybook.MVP.view.BookListView
import br.com.android.aline.findmybook.models.Data
import br.com.android.aline.findmybook.models.ItemsItem


class BookListPresenterImpl(override val bookListView: BookListView, context: Context)
    : BookListPresenter {

    val model: BookListModel = BookListModelImpl(this)
    var data : Data? = Data()

    override fun getListBook(dataBook :  Data?)  {
       var listBook : List<ItemsItem?>? = null
        listBook = dataBook?.items
        bookListView.getList(listBook)

    }


    override fun sendTextUser() {
        val textUserBook = bookListView.getTextUser()
        model.getText(textUserBook)
    }


}