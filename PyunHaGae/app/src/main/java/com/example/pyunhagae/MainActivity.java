package com.example.pyunhagae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.example.pyunhagae.LoginActivity;
import com.example.pyunhagae.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView intro = (ImageView) findViewById(R.id.loading_view);
        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(intro);
        Glide.with(this).load(R.raw.intro).into(gifImage);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

    }
}