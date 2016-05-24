package com.herokuapp.angebagui.retrofitdemo.ui.main;
<<<<<<< HEAD
import android.os.Bundle;
=======

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
<<<<<<< HEAD
import android.widget.Toast;
=======
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
import com.herokuapp.angebagui.retrofitdemo.R;
import com.herokuapp.angebagui.retrofitdemo.adapter.BooksAdapter;
import com.herokuapp.angebagui.retrofitdemo.cloud.ItEbookRest;
import com.herokuapp.angebagui.retrofitdemo.cloud.response.QueryResponse;
<<<<<<< HEAD
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainActivity extends AppCompatActivity {
    private static final String DEFAULT_QUERY = "Android";
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String NO_ERROR_VALUE = "0";
=======

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String DEFAULT_QUERY = "Android";
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String NO_ERROR_VALUE = "0";

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Toast.makeText(MainActivity.this, getText(R.string.intro), Toast.LENGTH_LONG).show();

        RecyclerView bookRecyclerView = (RecyclerView)findViewById(R.id.books_recyclerView);
        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.books_swipe_refresh_layout);

        swipeRefreshLayout.setRefreshing(false);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {

            @Override
            public void onRefresh() {
                sendRequest(DEFAULT_QUERY);
                swipeRefreshLayout.setRefreshing(false);
            }
        });
<<<<<<< HEAD
=======

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
        //Ajouter un Layout Manager a notre recylerView
        bookRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Ajouter notre adapter
        bookRecyclerView.setAdapter(BooksAdapter.getInstance());

        //Lancer la requete maintenant
        sendRequest(DEFAULT_QUERY);
    }
<<<<<<< HEAD
    private void sendRequest(final String query) {
        Call<QueryResponse> call = ItEbookRest.get().search(query);
=======

    private void sendRequest(final String query) {
        Call<QueryResponse> call = ItEbookRest.get().search(query);

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
        //Lançons notre objet call de manière asynchroune
        call.enqueue(new Callback<QueryResponse>() {
            @Override
            public void onResponse(Call<QueryResponse> call, Response<QueryResponse> response) {
<<<<<<< HEAD
                if (response.isSuccessful()){
                    //Recupérer le corps de la reponse que Retrofit s'est chargé de désérialiser à notre place l'aide du convertor Gson
                    final QueryResponse r = response.body();
                    if (r.error !=null && r.error.equals(NO_ERROR_VALUE)){
                        if (r.books !=null){
                            BooksAdapter.getInstance().setBooks(r.books);
                        }
                    } else{
                        Toast.makeText(MainActivity.this, r.error, Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Erreur rencontrée", Toast.LENGTH_LONG).show();
                    Log.d(TAG, "onResponse =>>> code = "+response.code());
                }

            }
=======
                Log.d(TAG, "onResponse =>>> code = "+response.code());
                //Recupérer le corps de la reponse que Retrofit s'est chargé de désérialiser à notre place l'aide du convertor Gson
                final QueryResponse r = response.body();
                if (r.error !=null && r.error.equals(NO_ERROR_VALUE)){
                    if (r.books !=null){
                        BooksAdapter.getInstance().setBooks(r.books);
                    }
                }else{
                    Toast.makeText(MainActivity.this, r.error, Toast.LENGTH_LONG).show();
                }

            }

>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
            @Override
            public void onFailure(Call<QueryResponse> call, Throwable t) {
                Log.e(TAG, "onFailure =>>>", t);
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
<<<<<<< HEAD
    }
=======

    }


>>>>>>> dc78640767f374d6491b763d7c93cc4db05ea7e5
}
