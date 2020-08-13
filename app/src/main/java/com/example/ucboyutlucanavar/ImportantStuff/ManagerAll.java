package com.example.ucboyutlucanavar.ImportantStuff;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager {

    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance()
    {
        return ourInstance;
    }

    public Call<List<Models>> getData()
    {
        Call<List<Models>> call = getRestApiClient().modelGetir ();
        return call;
    }
}
