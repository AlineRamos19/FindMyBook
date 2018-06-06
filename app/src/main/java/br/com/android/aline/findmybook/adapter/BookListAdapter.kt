package br.com.android.aline.findmybook.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.android.aline.findmybook.R
import br.com.android.aline.findmybook.models.ItemsItem
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_clicked.view.*
import kotlinx.android.synthetic.main.row_book.view.*


class BookListAdapter(val listBook: List<ItemsItem?>?, val context: Context) :
        RecyclerView.Adapter<BookListAdapter.BookViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.row_book, parent, false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBook!!.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {

        if (listBook?.get(position)?.volumeInfo?.imageLinks?.thumbnail == null) {
            holder.imageBook.setImageResource(R.drawable.placeholder)
        } else {
            Glide.with(context).load(listBook.get(position)?.volumeInfo?.imageLinks?.thumbnail)
                    .into(holder.imageBook)
        }
        holder.title?.text = listBook?.get(position)?.volumeInfo?.title

        holder.itemView.setOnClickListener {
            val builder = AlertDialog.Builder(context).setNegativeButton("Cancelar", DialogInterface.OnClickListener { dialog, which ->

            })

            val view = LayoutInflater.from(context).inflate(R.layout.item_clicked, null)

            if (listBook?.get(position)?.volumeInfo?.imageLinks?.thumbnail == null) {
                view.image_book_dialog.setImageResource(R.drawable.placeholder)
            } else {
                Glide.with(context).load(listBook.get(position)?.volumeInfo?.imageLinks?.thumbnail)
                        .into(view.image_book_dialog)
            }

            view.title_dialog.setText(listBook?.get(position)?.volumeInfo?.title)
            view.author_dialog.setText(listBook?.get(position)?.volumeInfo?.authors?.first())
            view.snnipet_dialog.setText(listBook?.get(position)?.searchInfo?.textSnippet)

            view.sale_dialog.setOnClickListener {
                val uri = Uri.parse(listBook?.get(position)?.volumeInfo?.infoLink)
                val intent = Intent(Intent.ACTION_VIEW, uri)
                view.context.startActivity(intent)
            }


            builder.setView(view)
            val alertDialog = builder.create()
            alertDialog.show()

        }
    }

    class BookViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val imageBook = itemView!!.image_book
        val title = itemView!!.label_title

    }
}




