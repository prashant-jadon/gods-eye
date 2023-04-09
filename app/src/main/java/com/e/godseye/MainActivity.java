package com.e.godseye;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout dotsLayout;
    private slideAdapter slideadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        slideadapter = new slideAdapter(this);

        viewPager = (ViewPager) findViewById(R.id.slideViewPages);
        viewPager.setAdapter(slideadapter);

    }
}