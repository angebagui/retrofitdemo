package com.herokuapp.angebagui.retrofitdemo.cloud;
<<<<<<< HEAD
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ItEbookRest {
    private static final String API_URL = "http://it-ebooks-api.info/v1/";
    private static ItEbookService service;
=======

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by angebagui on 21/05/2016.
 */
public class ItEbookRest {
    private static final String API_URL = "http://it-ebooks-api.info/v1/";

    private static ItEbookService service;

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    public static ItEbookService get(){
        if(service == null){
            final Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            service = retrofit.create(ItEbookService.class);
        }
        return service;
    }
}
