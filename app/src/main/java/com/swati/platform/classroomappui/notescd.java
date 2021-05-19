package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class notescd extends AppCompatActivity {
    PDFView ain2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notescd);
        ain2=(PDFView)findViewById(R.id.notescd);
        ain2.fromAsset("cd.pdf").load();

    }
}