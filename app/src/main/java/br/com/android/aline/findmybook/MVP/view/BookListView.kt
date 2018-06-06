package br.com.android.aline.findmybook.MVP.view

import br.com.android.aline.findmybook.models.ItemsItem

interface BookListView {

    fun getTextUser() : String
    fun getList(list : List<ItemsItem?>?)



}