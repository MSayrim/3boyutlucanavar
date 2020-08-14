package com.example.ucboyutlucanavar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.ucboyutlucanavar.ImportantStuff.Adapter.ImageAdapter;
import com.example.ucboyutlucanavar.ImportantStuff.Adapter.Picture;
import com.example.ucboyutlucanavar.ImportantStuff.Models;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    List<Picture> pics;
    List<Models> respondeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_detail );


        Intent intent = new Intent (  );
        Bundle content = getIntent ().getExtras ();
        Models thatModel = (Models)content.getSerializable ( "selected project" );
        TextView name = (TextView) findViewById ( R.id.modelNameDetail );
        TextView catagory = (TextView) findViewById ( R.id.modelCatagoryDetail );
        TextView size = (TextView) findViewById ( R.id.modelSizeDetail );
        TextView price = (TextView) findViewById ( R.id.modelPriceDetail );

        name.setText ( thatModel.getProductName () );
        catagory.setText ( thatModel.getProductCatagory () );



        size.setText ( thatModel.getProductSize ().toString () + "CM");
        price.setText ( thatModel.getProductPrice ().toString () + "₺" );

        pics = new ArrayList<Picture> ();

        pics.add (new Picture ( thatModel.getPicture2 ()) );
        pics.add ( new Picture ( thatModel.getPicture3 ()) );
        pics.add ( new Picture ( thatModel.getPicture4 () ));
        pics.add (new Picture (  thatModel.getPicture5 () ));
        pics.add (new Picture (  thatModel.getPicture6 () ));
        pics.add (new Picture (  thatModel.getPicture7 () ));
        pics.add (new Picture (  thatModel.getPicture8 () ));
        pics.add (new Picture (  thatModel.getPicture9 () ));




        ViewPager viewPager = findViewById ( R.id.picSlaty );
        ImageAdapter adapter = new ImageAdapter (pics,this);
        viewPager.setAdapter ( adapter );

    }
}
