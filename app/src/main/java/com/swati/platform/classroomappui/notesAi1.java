package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class notesAi1 extends AppCompatActivity {
    PDFView  ain1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_ai1);
        ain1=(PDFView)findViewById(R.id.ai11);
        ain1.fromAsset("ai1.pdf").load();
    }
}