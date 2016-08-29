package com.marvin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.base.view.OverScrollView;

public class Main3Activity extends AppCompatActivity {

    OverScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        scrollView = (OverScrollView) this.findViewById(R.id.scrollView);

        /*ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.mipmap.splash);
        scrollView.addView(imageView, -1,
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));*/

    }
}
