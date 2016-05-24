package com.herokuapp.angebagui.retrofitdemo.cloud;
import com.herokuapp.angebagui.retrofitdemo.cloud.response.QueryResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface ItEbookService {
    // Lancer la requete par mot clé (query)
    @GET("search/{query}")
    Call<QueryResponse> search(@Path("query")String query);
}
