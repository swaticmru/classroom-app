package com.swati.platform.classroomappui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;



public class ai extends AppCompatActivity {
CardView syllabusai, m1,m2,m3,m4,m5,qbAi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        syllabusai=(CardView)findViewById(R.id.syllabus);
        m1=(CardView)findViewById(R.id.mod1);
        m2=(CardView)findViewById(R.id.mod2);
        m3=(CardView)findViewById(R.id.mod3);
        m4=(CardView)findViewById(R.id.mod4);
        m5=(CardView)findViewById(R.id.mod5);
        qbAi=(CardView)findViewById(R.id.qbai);

        syllabusai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(ai.this, notesAi.class);
                startActivity(i1);

            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(ai.this, notesAi1.class);
                startActivity(i2);

            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(ai.this, notesAi2.class);
                startActivity(i3);

            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(ai.this, notesAi3.class);
                startActivity(i4);

            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(ai.this, notesAi4.class);
                startActivity(i5);

            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(ai.this, notesAi5.class);
                startActivity(i6);

            }
        });
        qbAi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(ai.this, notesAi6.class);
                startActivity(i7);

            }
        });


    }
}