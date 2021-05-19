package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class notesSg extends AppCompatActivity {
    PDFView  ain1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_sg);
        ain1=(PDFView)findViewById(R.id.sg_0);
        ain1.fromAsset("sg1.pdf").load();
    }
}