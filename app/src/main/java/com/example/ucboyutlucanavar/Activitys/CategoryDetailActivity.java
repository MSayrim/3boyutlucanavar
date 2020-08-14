package com.example.ucboyutlucanavar.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ucboyutlucanavar.Adapter.ModelAdapter;
import com.example.ucboyutlucanavar.Adapter.Picture;
import com.example.ucboyutlucanavar.WebApi.ManagerAll;
import com.example.ucboyutlucanavar.Models.Model;
import com.example.ucboyutlucanavar.R;

import java.io.Serializable;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryDetailActivity extends AppCompatActivity {

    ListView listView2;
    List<Picture> pics;
    List<Model> respondeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_catagory_detail );
        tanimla ();
        istek ();

        Intent intent = new Intent (  );
        String category = intent.getStringExtra ( "category" );


    }


    public void tanimla()
    {
        listView2 = findViewById ( R.id.modelList );
    }

    public  void istek()
    {
        final Call<List<Model>> modelList = ManagerAll.getInstance().getData();
        modelList.enqueue ( new Callback<List<Model>> () {
            @Override
            public void onResponse(Call<List<Model>> call, final Response<List<Model>> response) {
                respondeList = response.body ();
                final ModelAdapter modelAdapter = new ModelAdapter (respondeList,getApplicationContext () );
                listView2.setAdapter ( modelAdapter );

                listView2.setOnItemClickListener(new AdapterView.OnItemClickListener () {
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {

                        Intent intent2 = new Intent(getApplicationContext (), DetailActivity.class);


                        intent2.putExtra ( "selected project", (Serializable) respondeList.get ( position ) );
                        startActivity(intent2);

                    }
                });

            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                String str = "";
                str = "";
            }
        } );
    }
}
