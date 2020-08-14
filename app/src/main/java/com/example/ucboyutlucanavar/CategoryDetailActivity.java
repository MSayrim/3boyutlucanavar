package com.example.ucboyutlucanavar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ucboyutlucanavar.ImportantStuff.Adapter.CategoryAdapter;
import com.example.ucboyutlucanavar.ImportantStuff.Adapter.ImageAdapter;
import com.example.ucboyutlucanavar.ImportantStuff.Adapter.ModelAdapter;
import com.example.ucboyutlucanavar.ImportantStuff.Adapter.Picture;
import com.example.ucboyutlucanavar.ImportantStuff.ManagerAll;
import com.example.ucboyutlucanavar.ImportantStuff.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryDetailActivity extends AppCompatActivity {

    ListView listView;
    List<Picture> pics;
    List<Models> respondeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_catagory_detail );
        tanimla ();
        istek ();



    }


    public void tanimla()
    {
        listView = findViewById ( R.id.modelList );
    }

    public  void istek()
    {
        final Call<List<Models>> modelList = ManagerAll.getInstance().getData();
        modelList.enqueue ( new Callback<List<Models>> () {
            @Override
            public void onResponse(Call<List<Models>> call, Response<List<Models>> response) {
                respondeList = response.body ();
                ModelAdapter modelAdapter = new ModelAdapter (respondeList,getApplicationContext () );
                listView.setAdapter ( modelAdapter );

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener () {
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {

                        Intent intent = new Intent(getApplicationContext (), DetailActivity.class);

                        intent.putExtra ( " selected project", (ArrayList<Models>) respondeList );
                        startActivity(intent);

                    }
                });

            }

            @Override
            public void onFailure(Call<List<Models>> call, Throwable t) {
                String str = "";
                str = "";
            }
        } );
    }
}
