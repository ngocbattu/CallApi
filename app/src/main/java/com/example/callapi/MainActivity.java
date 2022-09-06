package com.example.callapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.callapi.adapter.CatAdapter;
import com.example.callapi.callBack.RetrofitInterface;
import com.example.callapi.model.Cat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<Cat> list;
    private CatAdapter adapter;
//    private List<Details> details;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.rcyListAimal);

        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        list = new ArrayList<>();
//        details = new ArrayList<>();
        adapter = new CatAdapter(this,list);
        mRecyclerView.setAdapter(adapter);

        Gson gson = new GsonBuilder()
                .setLenient ()
                .create ();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.thecatapi.com/v1/images/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);

        Call<List<Cat>> listCall = retrofitInterface.getListCat("10","beng","REPLACE_ME");
        listCall.enqueue(new Callback<List<Cat>>() {
            @Override
            public void onResponse(Call<List<Cat>> call, Response<List<Cat>> response) {
                List<Cat> list1 = response.body();
                for(int i = 0 ; i < list1.size() ; i++){
                    Log.d("TAG", "onResponse: " + list1.get(i).getId());
                    list.add(list1.get(i));
                    adapter.notifyDataSetChanged();
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Cat>> call, Throwable t) {

            }
        });


    }
    public void DetailsCat(String id){// sai ten
       Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
       intent.putExtra("_id",id);
        startActivity(intent);
    }
}