package br.com.android.aline.findmybook.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitConfig (
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("https://www.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
) {

    fun  getBookService() : FindBookService{
        return this.retrofit.create(FindBookService::class.java)
    }

}