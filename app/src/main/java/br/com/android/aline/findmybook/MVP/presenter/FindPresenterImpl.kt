package br.com.android.aline.findmybook.MVP.presenter

import android.content.Context
import br.com.android.aline.findmybook.MVP.model.FindModelImpl
import br.com.android.aline.findmybook.MVP.view.FindView


class FindPresenterImpl(override val findView: FindView,  context: Context) : FindPresenter {

    val model = FindModelImpl(context)

    override fun checkNetwork(): Boolean {
        return model.checkNetworkOpen()
    }
}