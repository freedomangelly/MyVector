package com.example.freed.myapplication;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class VectorDemo extends AppCompatActivity {
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vectordemo);
    }

    public void anim(View v){
        Log.i("info","doClick0");
        ImageView iv=(ImageView) v;
        Drawable drawable=iv.getDrawable();
        if(drawable instanceof Animatable){
            Log.i("info","doClick1");
            ((Animatable) drawable).start();
        }
    }
}
