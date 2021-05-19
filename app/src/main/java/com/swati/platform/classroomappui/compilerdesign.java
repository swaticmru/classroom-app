package com.swati.platform.classroomappui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.swati.platform.classroomappui.R;
import com.swati.platform.classroomappui.notescd;

public class compilerdesign extends AppCompatActivity {
    CardView syllabuscd, m1,m2,m3,m4,m5,qbcd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compilerdesign);
        syllabuscd=(CardView)findViewById(R.id.syllabuscd);
        m1=(CardView)findViewById(R.id.cd1);
        m2=(CardView)findViewById(R.id.cd2);
        m3=(CardView)findViewById(R.id.cd3);
        m4=(CardView)findViewById(R.id.cd4);
        m5=(CardView)findViewById(R.id.cd5);
        qbcd=(CardView)findViewById(R.id.cd6);
        syllabuscd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(compilerdesign.this, notescd.class);
                startActivity(i1);

            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(compilerdesign.this,notescd.class);
                startActivity(i2);

            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(compilerdesign.this,notescd.class);
                startActivity(i3);

            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(compilerdesign.this,notescd.class);
                startActivity(i4);

            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(compilerdesign.this,notescd.class);
                startActivity(i5);

            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(compilerdesign.this,notescd.class);
                startActivity(i6);

            }
        });
        qbcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(compilerdesign.this,notescd.class);
                startActivity(i7);

            }
        });

    }
}