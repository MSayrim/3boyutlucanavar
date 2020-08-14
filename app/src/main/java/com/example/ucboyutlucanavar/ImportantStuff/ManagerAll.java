package com.example.ucboyutlucanavar.ImportantStuff;

import com.example.ucboyutlucanavar.ImportantStuff.Category.Category;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager {

    private static ManagerAll ourInstance = new ManagerAll();
    private static ManagerAll ourInstance2 = new ManagerAll();

    public static synchronized ManagerAll getInstance()
    {
        return ourInstance;
    }

    public static synchronized ManagerAll getInstance2()
    {
        return ourInstance2;
    }

    public Call<List<Models>> getData()
    {
        Call<List<Models>> call = getRestApiClient().modelGetir ();
        return call;
    }
    public Call<List<Category>> getData2()
    {
        Call<List<Category>> call2 = getRestApiClient().categoryGetir ();
        return call2;
    }
}
