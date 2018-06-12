package br.com.android.aline.findmybook.activity

import android.content.Context
import android.os.Bundle
import android.support.v4.app.NavUtils
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View
import br.com.android.aline.findmybook.MVP.presenter.BookListPresenter
import br.com.android.aline.findmybook.MVP.presenter.BookListPresenterImpl
import br.com.android.aline.findmybook.MVP.view.BookListView
import br.com.android.aline.findmybook.R
import br.com.android.aline.findmybook.adapter.BookListAdapter
import br.com.android.aline.findmybook.models.ItemsItem
import kotlinx.android.synthetic.main.activity_books_list.*
import kotlinx.android.synthetic.main.toolbar.*

class BooksListActivity : AppCompatActivity(), BookListView {

    val context: Context = this
    val presenter: BookListPresenter = BookListPresenterImpl(this, context)
    var textUserBook: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_list)

        setSupportActionBar(toolbar_list as Toolbar?)
        supportActionBar!!.setDisplayShowTitleEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeButtonEnabled(true)
    }

    override fun onStart() {
        super.onStart()

        progress_bar.visibility = View.VISIBLE
        textUserBook = intent.getStringExtra("bookUser")
        presenter.sendTextUser()
    }

    override fun getTextUser(): String {
        return textUserBook
    }

    override fun getList(list: List<ItemsItem?>?) {
        recycler.setHasFixedSize(true)
        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager
        progress_bar.visibility = View.INVISIBLE

        if (list != null) {
            title_toolbar_book.setText(getString(R.string.title_toolbar_livros))
            val adapter = BookListAdapter(list, context)
            recycler.adapter = adapter
        } else {
            val bookNotFoundFragment = BookNotFoundFragment()
            supportFragmentManager.beginTransaction().replace(R.id.frag_book_not_found, bookNotFoundFragment).commit()
            title_toolbar_book.setText("")
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()){
            android.R.id.home -> {
                NavUtils.navigateUpFromSameTask(this)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
