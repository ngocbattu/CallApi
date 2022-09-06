package com.example.callapi.callBack;

import com.example.callapi.model.Cat;
import com.example.callapi.model.Details;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitInterface {
//https://api.thecatapi.com/v1/images/search?limit=10&breed_ids=beng&api_key=REPLACE_ME
    @GET("search")
    Call<List<Cat>> getListCat(@Query("limit") String limit ,
                               @Query("breed_ids") String breed_ids,
                               @Query("api_key") String api_key);

    @GET("{position}")
    Call<Details> getDetails(@Path(value = "position") String position );
}
