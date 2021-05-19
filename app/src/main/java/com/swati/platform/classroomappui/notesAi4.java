package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class notesAi4 extends AppCompatActivity {
    PDFView ain4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_ai4);
        ain4=(PDFView)findViewById(R.id.ai4);
        ain4.fromAsset("ai4.pdf").load();

    }
}