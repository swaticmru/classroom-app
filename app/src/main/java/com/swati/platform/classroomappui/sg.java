package com.swati.platform.classroomappui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.swati.platform.classroomappui.R;

public class sg extends AppCompatActivity {
    CardView syllabusSg, m1,m2,m3,m4,m5,qbsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sg);
        syllabusSg=(CardView)findViewById(R.id.sg1);
        m1=(CardView)findViewById(R.id.sg2);
        m2=(CardView)findViewById(R.id.sg3);
        m3=(CardView)findViewById(R.id.sg4);
        m4=(CardView)findViewById(R.id.sg5);
        m5=(CardView)findViewById(R.id.sg6);
        qbsg=(CardView)findViewById(R.id.sg7);

        syllabusSg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(sg.this,notesSg.class);
                startActivity(i1);

            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(sg.this,notesSg1.class);
                startActivity(i2);

            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(sg.this,notesSg2.class);
                startActivity(i3);

            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(sg.this,notesSg3.class);
                startActivity(i4);

            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(sg.this,notesSg4.class);
                startActivity(i5);

            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(sg.this,notesSg5.class);
                startActivity(i6);

            }
        });
        qbsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(sg.this,notesSg6.class);
                startActivity(i7);

            }
        });


    }
}