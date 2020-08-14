package com.example.ucboyutlucanavar.ImportantStuff.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ucboyutlucanavar.ImportantStuff.Category.Category;
import com.example.ucboyutlucanavar.ImportantStuff.Models;
import com.example.ucboyutlucanavar.ImportantStuff.PicStuff.RoundedTransformation;
import com.example.ucboyutlucanavar.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

public class CategoryAdapter extends BaseAdapter {
    private List<Category> currencyAll;
    private Context context;

    public CategoryAdapter(List<Category> currencyAll, Context context)
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


        TextView valueView = convertView.findViewById(R.id.deger2 );
        Category currency = currencyAll.get(position);
        valueView.setText( currency.getCategoryName () +" " );





        String pic2= "https://www.3boyutlucanavar.com/wp-content/uploads/2020/assets/"+currency.getCategoryPic ();
        //Picasso.with ( context ).load ( pic).into ( imageView );

        final View finalConvertView = convertView;

//.transform ( new RoundedTransformation (15,5) )

        Picasso.with(context).load(pic2).into( new Target (){
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                finalConvertView.setBackground(new BitmapDrawable (context.getResources(), bitmap));
            }

            @Override
            public void onBitmapFailed(final Drawable errorDrawable) {
                Log.d("TAG", "FAILED");
            }

            @Override
            public void onPrepareLoad(final Drawable placeHolderDrawable) {
                Log.d("TAG", "Prepare Load");
            }

        });


        return convertView;
}




}
