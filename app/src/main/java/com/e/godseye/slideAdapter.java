package com.e.godseye;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class slideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public slideAdapter(Context context){
        this.context = context;
    }

    public  int[] slideImages = {
        R.drawable.a1,
        R.drawable.a2,
        R.drawable.a3
    };

    public  int[] slideImages2 = {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3
    };

    @Override
    public int getCount() {
        return slideImages.length;
    }

    @Override
    public boolean isViewFromObject( View view, Object object) {
        return view == (RelativeLayout) object;
    }

    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        layoutInflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImage = (ImageView) view.findViewById(R.id.slideImage);
        ImageView slideImage2 = (ImageView) view.findViewById(R.id.slideImage2);
        slideImage.setImageResource(slideImages[position]);
        slideImage2.setImageResource(slideImages2[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
