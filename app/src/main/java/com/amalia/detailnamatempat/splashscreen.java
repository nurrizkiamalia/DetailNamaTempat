package com.amalia.detailnamatempat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.amalia.uasamalia.R;

public class splashscreen extends AppCompatActivity {

    final int SPLASH_DISPLAY_LENGTH = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = null;
                intent = new Intent(splashscreen.this, MainActivity.class);
                splashscreen.this.finish();
                splashscreen.this.startActivity(intent);
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}