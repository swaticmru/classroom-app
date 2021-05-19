package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class notesins extends AppCompatActivity {
    PDFView ain1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_notesins);
        super.onCreate(savedInstanceState);
        ain1 = (PDFView) findViewById(R.id.ins);
        ain1.fromAsset("ins.pdf").load();
    }
}