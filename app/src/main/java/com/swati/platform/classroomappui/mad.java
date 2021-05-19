package com.swati.platform.classroomappui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.swati.platform.classroomappui.R;
import com.swati.platform.classroomappui.notesmad;

public class mad extends AppCompatActivity {
    CardView syllabusmad, m1,m2,m3,m4,m5,qbmad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad);
        syllabusmad=(CardView)findViewById(R.id.syllabusmad);
        m1=(CardView)findViewById(R.id.mad1);
        m2=(CardView)findViewById(R.id.mad2);
        m3=(CardView)findViewById(R.id.mad3);
        m4=(CardView)findViewById(R.id.mad4);
        m5=(CardView)findViewById(R.id.mad5);
        qbmad=(CardView)findViewById(R.id.mad6);

        syllabusmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(mad.this, notesmad.class);
                startActivity(i1);

            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(mad.this,notesmad.class);
                startActivity(i2);

            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(mad.this,notesmad.class);
                startActivity(i3);

            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(mad.this,notesmad.class);
                startActivity(i4);

            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(mad.this,notesmad.class);
                startActivity(i5);

            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(mad.this,notesmad.class);
                startActivity(i6);

            }
        });
        qbmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(mad.this,notesmad.class);
                startActivity(i7);

            }
        });
    }
}