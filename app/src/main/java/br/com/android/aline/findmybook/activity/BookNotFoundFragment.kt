package br.com.android.aline.findmybook.activity

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.android.aline.findmybook.R
import kotlinx.android.synthetic.main.fragment_book_not_found.*

class BookNotFoundFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_book_not_found, container, false)
    }

    override fun onStart() {
        super.onStart()

        try_again.setOnClickListener {
            context!!.startActivity(Intent(context!!, FindActivity::class.java))
        }
    }
}
