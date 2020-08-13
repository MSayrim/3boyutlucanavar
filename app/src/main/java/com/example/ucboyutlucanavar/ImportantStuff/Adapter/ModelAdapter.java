package com.example.ucboyutlucanavar.ImportantStuff.Adapter;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ucboyutlucanavar.ImportantStuff.Models;
import com.example.ucboyutlucanavar.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;

import static com.example.ucboyutlucanavar.R.layout.list_view_bar;

public class ModelAdapter extends BaseAdapter {
    private List<Models> currencyAll;
    private Context context;

    public ModelAdapter(List<Models> currencyAll, Context context)
    {
        this.currencyAll = currencyAll;
        this.context = context ;
    }

    @Override
    public int getCount() {
        return currencyAll.size ();
    }

    @Override
    public Object getItem(int i) {
        return currencyAll.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate ( R.layout.list_view_bar,parent,false );


        TextView valueView = convertView.findViewById(R.id.deger1 );
        TextView valueView2 = convertView.findViewById(R.id.deger2 );
        TextView valueView3 = convertView.findViewById(R.id.deger3 );
        ImageView imageView = convertView.findViewById ( R.id.tumbnail );
        Models currency = currencyAll.get(position);
        valueView.setText( currency.getProductName () +" " );

        valueView2.setText( currency.getProductCatagory () +" " );

        valueView3.setText("Boyut :    " + currency.getProductSize () +"CM "   );

        imageView.setScaleType ( ImageView.ScaleType.FIT_XY );
        String pic= "https://www.3boyutlucanavar.com/wp-content/uploads/2020/08/"+currency.getTumbnail ();
        Picasso.with ( context ).load ( pic).into ( imageView );




        return convertView;
    }




}
