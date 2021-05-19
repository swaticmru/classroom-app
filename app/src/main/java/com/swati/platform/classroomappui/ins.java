package com.swati.platform.classroomappui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.swati.platform.classroomappui.R;
import com.swati.platform.classroomappui.notesSg;
import com.swati.platform.classroomappui.notesins;

public class ins extends AppCompatActivity {
    CardView syllabusins, m1,m2,m3,m4,m5,qbins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ins);
        syllabusins=(CardView)findViewById(R.id.syllabusins);
        m1=(CardView)findViewById(R.id.ins1);
        m2=(CardView)findViewById(R.id.ins2);
        m3=(CardView)findViewById(R.id.ins3);
        m4=(CardView)findViewById(R.id.ins4);
        m5=(CardView)findViewById(R.id.ins5);
        qbins=(CardView)findViewById(R.id.ins6);

        syllabusins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(ins.this, notesSg.class);
                startActivity(i1);

            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(ins.this, notesins.class);
                startActivity(i2);

            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(ins.this,notesins.class);
                startActivity(i3);

            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(ins.this,notesins.class);
                startActivity(i4);

            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(ins.this,notesins.class);
                startActivity(i5);

            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(ins.this,notesins.class);
                startActivity(i6);

            }
        });
        qbins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(ins.this,notesins.class);
                startActivity(i7);

            }
        });

    }
}