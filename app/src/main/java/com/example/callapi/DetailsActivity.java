package com.example.callapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.callapi.callBack.RetrofitInterface;
import com.example.callapi.model.Details;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageCat;
    TextView txtName;
    TextView txtCfa_url;
    TextView txtVetstreet_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageCat = findViewById(R.id.imageCatDetails);
        txtName = findViewById(R.id.txt_name);
        txtCfa_url = findViewById(R.id.txt_cfa_url);
        txtVetstreet_url = findViewById(R.id.txt_vetstreet_url);

        Intent i = getIntent();

        String idCat = i.getStringExtra("_id");
        getApiDetails(idCat);

    }
    public void getApiDetails(String id){
        Gson gson = new GsonBuilder()
                .setLenient ()
                .create ();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.thecatapi.com/v1/images/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);

        Call<Details> call = retrofitInterface.getDetails(id);
       call.enqueue(new Callback<Details>() {
           @Override
           public void onResponse(Call<Details> call, Response<Details> response) {
               Log.d("hunghk", "onResponse: "+ response.body());
               List<Details.Breed> list = response.body().getBreeds();
               for(int i = 0 ;  i < list.size();  i++ ){
                   Glide.with(DetailsActivity.this).load(response.body().getUrl()).into(imageCat);
                   txtName.setText(list.get(i).getName());
                   txtCfa_url.setText(list.get(i).getCfaUrl());
                   txtVetstreet_url.setText(list.get(i).getVetstreetUrl());
               }
           }

           @Override
           public void onFailure(Call<Details> call, Throwable t) {
               Log.d("TAG", "onFailure: " + t);
           }
       });
    }
}