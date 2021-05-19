package com.swati.platform.classroomappui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class library extends AppCompatActivity {
ImageView b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        b1=(ImageView) findViewById(R.id.tb1);
        b2=(ImageView) findViewById(R.id.tb2);
        b3=(ImageView) findViewById(R.id.tb3);
        b4=(ImageView) findViewById(R.id.tb4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(library.this,book1.class);
                startActivity(i1);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(library.this,book2.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(library.this,book3.class);
                startActivity(i3);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(library.this,book4.class);
                startActivity(i4);

            }
        });

    }
}