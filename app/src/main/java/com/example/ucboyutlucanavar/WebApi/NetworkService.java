package com.example.ucboyutlucanavar.WebApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    private static NetworkService mInstance;

    private static NetworkService mInstance2;
    private static final String BASE_URL2 = "https://www.3boyutlucanavar.com/connections/category.php";

    private static final String BASE_URL = "https://www.3boyutlucanavar.com/connections/modelfinal.php";
    private Retrofit mRetrofit;
    private Retrofit mRetrofit2;

    private NetworkService() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory( GsonConverterFactory.create())
                .build();

        mRetrofit2 = new Retrofit.Builder()
                .baseUrl(BASE_URL2)
                .addConverterFactory( GsonConverterFactory.create())
                .build();
    }

    public static NetworkService getInstance() {
        if (mInstance == null) {
            mInstance = new NetworkService();
        }
        return mInstance;
    }

    public static NetworkService getInstance2() {
        if (mInstance == null) {
            mInstance = new NetworkService();
        }
        return mInstance2;
    }
}
