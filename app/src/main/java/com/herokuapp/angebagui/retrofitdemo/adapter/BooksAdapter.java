package com.herokuapp.angebagui.retrofitdemo.adapter;
<<<<<<< HEAD
=======

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
<<<<<<< HEAD
import com.herokuapp.angebagui.retrofitdemo.R;
import com.herokuapp.angebagui.retrofitdemo.model.Book;
import java.util.Collections;
import java.util.List;
public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BookViewHolder>{
=======

import com.herokuapp.angebagui.retrofitdemo.R;
import com.herokuapp.angebagui.retrofitdemo.model.Book;

import java.util.Collections;
import java.util.List;

/**
 * Created by angebagui on 21/05/2016.
 */
public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BookViewHolder>{

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    private static  BooksAdapter instance;
    private List<Book> books = Collections.emptyList();

    /**
<<<<<<< HEAD
     * J'initialise l'adapter une seule fois dans mon projet alors je préfère faire de lui un singleton
=======
     * J'initialiser l'adapter une seule fois dans mon projet alors je préfère faire de lui un singleton
>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
     * @return
     */
    public static BooksAdapter getInstance(){
        if (instance==null){
            instance = new BooksAdapter();
        }
        return instance;
    }
    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_book,parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {


            // Récupérer l'élement à cette position de l'adapter
            final Book itemBook = books.get(position);

            // Nous vérifions que les champ ne sont pas null avant de les utiliser

            if (itemBook.title != null){
                holder.titleTextView.setText(itemBook.title);
            }

            if (itemBook.subtitle != null){
                holder.subtitleTextView.setText(itemBook.subtitle);
            }

            if (itemBook.description != null ){
                holder.smallDescriptionTextView.setText(itemBook.description);
            }

    }
<<<<<<< HEAD
=======

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    @Override
    public int getItemCount() {

        return books.size();
    }
<<<<<<< HEAD
=======

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    public void setBooks(List<Book> books) {
        this.books = books;
        notifyDataSetChanged();
    }
<<<<<<< HEAD
=======

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    /**
     * Notre adapter a besoin d'un container de vue appelé ViewHolder
     */
    public static class BookViewHolder extends RecyclerView.ViewHolder{
        public TextView titleTextView;
        public TextView subtitleTextView;
        public TextView smallDescriptionTextView;
        public BookViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView)itemView.findViewById(R.id.title_textView);
            subtitleTextView = (TextView)itemView.findViewById(R.id.subtitle_textView);
            smallDescriptionTextView = (TextView)itemView.findViewById(R.id.small_description_textView);
        }
    }
}
