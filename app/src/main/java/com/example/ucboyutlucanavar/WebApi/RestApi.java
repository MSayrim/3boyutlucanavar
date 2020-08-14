package com.example.ucboyutlucanavar.WebApi;

import com.example.ucboyutlucanavar.Models.Category;
import com.example.ucboyutlucanavar.Models.Model;

import java.util.List;

import retrofit2.Call;

public interface RestApi {
    //@retrofit2.http.GET("/connections/models.php")
    @retrofit2.http.GET("/connections/modelfinal.php")
    Call<List<Model>> modelGetir();

    @retrofit2.http.GET("/connections/category.php")
    Call<List<Category>> categoryGetir();
    //

}
