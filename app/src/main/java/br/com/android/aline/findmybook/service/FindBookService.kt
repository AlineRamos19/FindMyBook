package br.com.android.aline.findmybook.service

import br.com.android.aline.findmybook.models.Data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface FindBookService {

    @GET("/books/v1/volumes?/")
    fun getBookList (@Query ("q") textUser : String) : Call<Data>

}