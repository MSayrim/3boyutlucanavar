package com.example.ucboyutlucanavar.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends PagerAdapter {

    private Context mContext;
    private List<Picture> pics;

    public ImageAdapter(List<Picture> pics,Context context)
    {

        this.pics = pics;
        mContext = context;
    }

    @Override
    public int getCount() {
        return pics.size ();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView ( mContext );
        Picture currency = pics.get(position);
        String pic= "https://www.3boyutlucanavar.com/wp-content/uploads/2020/08/"+currency.getPicture ();
        imageView.setScaleType ( ImageView.ScaleType.FIT_XY );
        Picasso.with ( mContext ).load ( pic).into ( imageView );
        container.addView ( imageView,0 );

        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView ( (ImageView) object );
    }
}
