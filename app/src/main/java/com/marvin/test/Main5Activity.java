package com.marvin.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.base.view.MySurfaceView;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener{


    MySurfaceView mySurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        mySurfaceView = (MySurfaceView) this.findViewById(R.id.surface);
    }

    @Override
    public void onClick(View v) {
        this.startActivity(new Intent(this, Main4Activity.class));
        overridePendingTransition(R.anim.pop_up_in, 0);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
