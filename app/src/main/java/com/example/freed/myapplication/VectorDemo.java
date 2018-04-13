package com.example.freed.myapplication;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class VectorDemo extends AppCompatActivity {
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vectordemo);
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
    public void switchToL(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            startActivity(new Intent(VectorDemo.this, MainLActivity.class));
        }else {
            Toast.makeText(VectorDemo.this, "当前系统不支持L Plus", Toast.LENGTH_LONG).show();
        }
    }
}
