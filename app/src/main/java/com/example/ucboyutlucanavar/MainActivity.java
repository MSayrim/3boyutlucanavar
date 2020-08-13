package com.example.ucboyutlucanavar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ucboyutlucanavar.ImportantStuff.Adapter.ModelAdapter;
import com.example.ucboyutlucanavar.ImportantStuff.ManagerAll;
import com.example.ucboyutlucanavar.ImportantStuff.Models;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Models> respondeList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


     istek ();
        tanimla ();



    }


    public void tanimla()
    {
        listView = findViewById ( R.id.myList );
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
                        intent.putExtra ("selected project",respondeList.get ( position ));
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

