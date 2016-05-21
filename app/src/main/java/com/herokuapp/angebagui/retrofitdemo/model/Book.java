package com.herokuapp.angebagui.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by angebagui on 21/05/2016.
 */
public class Book {

    @SerializedName("ID") // Une annotation qui indique que ce champ doit être sérialisée à JSON avec la valeur de nom fourni comme clé.
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

    public Book(long id, String title, String subtitle, String description, String image, String isbn) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.image = image;
        this.isbn = isbn;
    }
}
