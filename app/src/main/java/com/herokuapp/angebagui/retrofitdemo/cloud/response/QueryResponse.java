package com.herokuapp.angebagui.retrofitdemo.cloud.response;
<<<<<<< HEAD
import com.google.gson.annotations.SerializedName;
import com.herokuapp.angebagui.retrofitdemo.model.Book;
import java.util.List;
public class QueryResponse {
=======

import com.google.gson.annotations.SerializedName;
import com.herokuapp.angebagui.retrofitdemo.model.Book;

import java.util.List;

/**
 * Created by angebagui on 21/05/2016.
 */
public class QueryResponse {

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    @SerializedName("Error")
    public final String error;
    @SerializedName("Time")
    public final double time;
    @SerializedName("Total")
    public final String total;
    @SerializedName("Page")
    public final int page;
    @SerializedName("Books")
    public List<Book> books;
<<<<<<< HEAD
=======


>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    public QueryResponse(List<Book> books, int page, String total, double time, String error) {
        this.books = books;
        this.page = page;
        this.total = total;
        this.time = time;
        this.error = error;
    }
}
