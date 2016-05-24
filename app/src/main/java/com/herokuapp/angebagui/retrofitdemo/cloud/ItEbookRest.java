package com.herokuapp.angebagui.retrofitdemo.cloud;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ItEbookRest {
    private static final String API_URL = "http://it-ebooks-api.info/v1/";
    private static ItEbookService service;
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
