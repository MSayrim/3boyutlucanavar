package com.example.ucboyutlucanavar.ImportantStuff.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.ucboyutlucanavar.ImportantStuff.Models;
import com.example.ucboyutlucanavar.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PictureAdapter extends BaseAdapter {
    private List<Picture> currencyAll;
    private Context context;


    public PictureAdapter(List<Picture> currencyAll, Context context)
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
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate ( R.layout.image_filler,parent,false );
        Picture currency = currencyAll.get(position);
        ImageView imageView = convertView.findViewById ( R.id.imageFillerView );
        String pic= "https://www.3boyutlucanavar.com/wp-content/uploads/2020/08/"+currency.getPicture ();
        Picasso.with ( context ).load ( pic).into ( imageView );

        return convertView;
    }
}
