package com.example.ucboyutlucanavar.ImportantStuff;

import com.example.ucboyutlucanavar.ImportantStuff.Category.Category;

import java.util.List;

import retrofit.http.GET;
import retrofit2.Call;

public interface RestApi {
    //@retrofit2.http.GET("/connections/models.php")
    @retrofit2.http.GET("/connections/modelfinal.php")
    Call<List<Models>> modelGetir();

    @retrofit2.http.GET("/connections/category.php")
    Call<List<Category>> categoryGetir();
    //

}
