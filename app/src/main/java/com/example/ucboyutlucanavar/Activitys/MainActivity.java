package com.example.ucboyutlucanavar.Activitys;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ucboyutlucanavar.Adapter.CategoryAdapter;
import com.example.ucboyutlucanavar.Models.Category;
import com.example.ucboyutlucanavar.WebApi.ManagerAll;
import com.example.ucboyutlucanavar.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Category> respondeList2;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );



        istek2 ();
        tanimla ();


    }


    public void tanimla()
    {
        listView = findViewById ( R.id.myList );
    }




    public  void istek2()
    {
        final Call<List<Category>> categoryList = ManagerAll.getInstance2().getData2();
        categoryList.enqueue ( new Callback<List<Category>> () {
            @Override
            public void onResponse(Call<List<Category>> call2, final Response<List<Category>> response2) {
                respondeList2 = response2.body ();

                final CategoryAdapter categoryAdapter= new CategoryAdapter (respondeList2,getApplicationContext () );

                listView.setAdapter ( categoryAdapter );



                listView.setOnItemClickListener(new AdapterView.OnItemClickListener () {
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        Intent intent = new Intent(getApplicationContext (),CategoryDetailActivity.class );



                        startActivity(intent);

                    }
                });

            }

            @Override
            public void onFailure(Call<List<Category>> call, Throwable t) {
                String str = "";
                str = "";
            }
        } );
    }

}

