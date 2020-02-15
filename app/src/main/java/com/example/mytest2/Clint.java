package com.example.mytest2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Clint {
    private static Retrofit retrofit= null;

    public static Retrofit getRetrofit(){

        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create()).build();


        }
        return retrofit;

    }
}
