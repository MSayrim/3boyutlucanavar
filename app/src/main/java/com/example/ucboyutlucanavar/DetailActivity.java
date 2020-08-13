package com.example.ucboyutlucanavar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ucboyutlucanavar.ImportantStuff.Adapter.ModelAdapter;
import com.example.ucboyutlucanavar.ImportantStuff.Adapter.Picture;
import com.example.ucboyutlucanavar.ImportantStuff.Adapter.PictureAdapter;
import com.example.ucboyutlucanavar.ImportantStuff.Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DetailActivity extends AppCompatActivity {

    ListView listView;
    List<Picture> pics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_detail );


        Intent intent = new Intent (  );
        Bundle content = getIntent ().getExtras ();
        Models thatModel = (Models)content.getSerializable ( "selected project" );
        TextView asd = (TextView) findViewById ( R.id.modelNameDetail );
        String result = thatModel.getPicture2 ();
        asd.setText ( result );

        pics = new ArrayList<Picture>();

        pics.add (new Picture ( thatModel.getPicture2 ()) );
        pics.add ( new Picture ( thatModel.getPicture3 ()) );
        pics.add ( new Picture ( thatModel.getPicture4 () ));
        pics.add (new Picture (  thatModel.getPicture5 () ));
        pics.add (new Picture (  thatModel.getPicture6 () ));
        pics.add (new Picture (  thatModel.getPicture7 () ));
        pics.add (new Picture (  thatModel.getPicture8 () ));
        pics.add (new Picture (  thatModel.getPicture9 () ));


        listView = findViewById ( R.id.imageList );
        PictureAdapter modelAdapter = new PictureAdapter (pics,getApplicationContext () );

        listView.setAdapter ( modelAdapter );
    }
}
