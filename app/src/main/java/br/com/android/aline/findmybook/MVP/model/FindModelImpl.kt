package br.com.android.aline.findmybook.MVP.model

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

class FindModelImpl(override val context: Context) : FindModel {

    override fun checkNetworkOpen(): Boolean {

        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE)
        return if (connectivityManager is ConnectivityManager) {
            val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
            networkInfo?.isConnected ?: false
        } else false
    }
}