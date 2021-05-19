package com.swati.platform.classroomappui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;


public class Announcements extends AppCompatActivity {
    CardView  iatt, sports, attendance, revised, football, dean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        iatt=(CardView)findViewById(R.id.iatt);
        sports=(CardView)findViewById(R.id.sports);
        attendance=(CardView)findViewById(R.id.attendance);
        revised=(CardView)findViewById(R.id.revised);
        football=(CardView)findViewById(R.id.football);
        dean=(CardView)findViewById(R.id.dean);

        iatt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent i1= new Intent(Announcements.this, iat2.class);
             startActivity(i1);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(Announcements.this, sports.class);
                startActivity(i2);
            }
        });
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3= new Intent(Announcements.this, attendance.class);
                startActivity(i3);
            }
        });
        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(Announcements.this, football.class);
                startActivity(i4);

            }
        });
        revised.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5= new Intent(Announcements.this, revisd.class);
                startActivity(i5);

            }
        });
        dean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6= new Intent(Announcements.this,dean.class);
                startActivity(i6);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
