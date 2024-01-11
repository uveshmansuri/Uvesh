package com.usm.zigmachat;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Intent i1=new Intent(splashscreen.this,MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               startActivity(i1);
               finish();
            }
        },1000);
    }
}