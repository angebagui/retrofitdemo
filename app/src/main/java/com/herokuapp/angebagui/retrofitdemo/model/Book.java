package com.herokuapp.angebagui.retrofitdemo.model;
<<<<<<< HEAD
import com.google.gson.annotations.SerializedName;
public class Book {
    @SerializedName("ID") // Une annotation qui indique que ce champ doit être sérialisée à JSON avec
    // la valeur de nom fourni comme clé.
=======

import com.google.gson.annotations.SerializedName;

/**
 * Created by angebagui on 21/05/2016.
 */
public class Book {

    @SerializedName("ID") // Une annotation qui indique que ce champ doit être sérialisée à JSON avec la valeur de nom fourni comme clé.
>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    public final long id;
    @SerializedName("Title")
    public final String title;
    @SerializedName("SubTitle")
    public final String subtitle;
    @SerializedName("Description")
    public final String description;
    @SerializedName("Image")
    public final String image;
    @SerializedName("isbn")
    public final String isbn;
<<<<<<< HEAD
=======

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    public Book(long id, String title, String subtitle, String description, String image, String isbn) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.image = image;
        this.isbn = isbn;
    }
}
