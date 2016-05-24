package com.herokuapp.angebagui.retrofitdemo.cloud;
<<<<<<< HEAD
import com.herokuapp.angebagui.retrofitdemo.cloud.response.QueryResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface ItEbookService {
    // Lancer la requete par mot clé (query)
    @GET("search/{query}")
    Call<QueryResponse> search(@Path("query")String query);
=======

import com.herokuapp.angebagui.retrofitdemo.cloud.response.QueryResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by angebagui on 21/05/2016.
 */
public interface ItEbookService {

    // Lancer la requete par mot clé (query)
    @GET("search/{query}")
    Call<QueryResponse> search(@Path("query")String query);

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
}
