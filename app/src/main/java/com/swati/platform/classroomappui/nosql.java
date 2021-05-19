package com.swati.platform.classroomappui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.swati.platform.classroomappui.R;
import com.swati.platform.classroomappui.notesql;

public class nosql extends AppCompatActivity {
    CardView syllabusql, m1,m2,m3,m4,m5,qbsql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nosql);
        syllabusql=(CardView)findViewById(R.id.syllabusql);
        m1=(CardView)findViewById(R.id.no1);
        m2=(CardView)findViewById(R.id.no2);
        m3=(CardView)findViewById(R.id.no3);
        m4=(CardView)findViewById(R.id.no4);
        m5=(CardView)findViewById(R.id.no5);
        qbsql=(CardView)findViewById(R.id.no6);
        syllabusql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(nosql.this, notesql.class);
                startActivity(i1);

            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(nosql.this,notesql.class);
                startActivity(i2);

            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(nosql.this,notesql.class);
                startActivity(i3);

            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(nosql.this,notesql.class);
                startActivity(i4);

            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(nosql.this,notesql.class);
                startActivity(i5);

            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(nosql.this,notesql.class);
                startActivity(i6);

            }
        });
        qbsql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(nosql.this,notesql.class);
                startActivity(i7);

            }
        });
    }
}