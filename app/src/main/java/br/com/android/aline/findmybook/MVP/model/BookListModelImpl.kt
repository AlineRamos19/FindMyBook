package br.com.android.aline.findmybook.MVP.model

import android.util.Log
import br.com.android.aline.findmybook.MVP.presenter.BookListPresenterImpl
import br.com.android.aline.findmybook.models.Data
import br.com.android.aline.findmybook.service.RetrofitConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BookListModelImpl (val presenter : BookListPresenterImpl) : BookListModel {

    var query: String = ""
    private val LOG_TAG = BookListModelImpl::class.java.simpleName

    override fun getText(query: String) {
        this.query = query
        getBookService()
    }

    override fun getBookService() {
        try {
            val call = RetrofitConfig().getBookService().getBookList(query)
            call.enqueue(object : Callback<Data> {

                override fun onFailure(call: Call<Data>?, t: Throwable?) {
                    Log.e(LOG_TAG, "Error: " + t?.message)
                }

                override fun onResponse(call: Call<Data>?, response: Response<Data>?) {
                    if (response!!.isSuccessful) {
                        val data  = response.body()
                        presenter.getListBook(data)
                    }
                }
            })

        } catch (e: Throwable) {
            Log.e(LOG_TAG, "Error: " + e.message)
        }
    }



}