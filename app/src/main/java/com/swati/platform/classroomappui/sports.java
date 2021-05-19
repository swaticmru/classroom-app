package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class sports extends AppCompatActivity {
    PDFView  ain1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        ain1=(PDFView)findViewById(R.id.sportss);
        ain1.fromAsset("sports.pdf").load();
    }
}