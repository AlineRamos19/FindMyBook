package br.com.android.aline.findmybook.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import br.com.android.aline.findmybook.MVP.presenter.FindPresenter
import br.com.android.aline.findmybook.MVP.presenter.FindPresenterImpl
import br.com.android.aline.findmybook.MVP.view.FindView
import br.com.android.aline.findmybook.R
import kotlinx.android.synthetic.main.activity_find.*
import kotlinx.android.synthetic.main.toolbar.*

class FindActivity : AppCompatActivity(), FindView {

    val context: Context = this

    val presenter: FindPresenter = FindPresenterImpl(this, context)

    var strBook: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find)

        setSupportActionBar(toolbar_find as Toolbar?)
        supportActionBar!!.setDisplayShowTitleEnabled(true)
       title_toolbar_book.text = "FIND"
    }

    override fun onStart() {
        super.onStart()
        checkEdit()
    }

    private fun checkEdit() {

        btn_find.setOnClickListener {
            btn_find.setTextColor(resources.getColor(android.R.color.white))
            strBook = edit_book.text.toString()

            val checkNetwork: Boolean = presenter.checkNetwork()
            if (checkNetwork) {
                if (!strBook.trim().isEmpty()) {
                    val intent = Intent(context, BooksListActivity::class.java)
                    intent.putExtra("bookUser", strBook)
                    startActivity(intent)
                } else {
                    showMessage("Favor inserir alguma informação.")
                }
            } else {
                val builder = AlertDialog.Builder(this@FindActivity)
                builder.setTitle("Atenção")
                builder.setMessage("Nenhuma rede disponivel.\nVerifique conexão e " +
                        "tente novamente.")
                builder.setPositiveButton("Ok"){
                    dialog, i ->
                    dialog.dismiss()
                }
                val alert = builder.create()
                alert.show()
            }
        }
    }

    override fun showMessage(message: String) {
        Snackbar.make(view_find, message, Snackbar.LENGTH_LONG).show()
    }
}
