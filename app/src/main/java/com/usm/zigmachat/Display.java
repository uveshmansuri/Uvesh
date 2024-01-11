package com.usm.zigmachat;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        ImageView ig=findViewById(R.id.img_person);
        TextView tv1=findViewById(R.id.tv_name);
        TextView tv2=findViewById(R.id.tv_no);
        TextView tv3=findViewById(R.id.tv_contry);
        TextView tv4=findViewById(R.id.tv_nik);
        Intent i_display=getIntent();
        ig.setImageResource(i_display.getIntExtra("img",0));
        tv1.setText("Name: "+i_display.getStringExtra("name"));
        tv2.setText("Mobile No: "+i_display.getStringExtra("no"));
        tv3.setText("Contry: "+i_display.getStringExtra("co"));
        tv4.setText("Nik Name: "+i_display.getStringExtra("nik"));
    }
}