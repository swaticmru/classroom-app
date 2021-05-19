package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class notesAi6 extends AppCompatActivity {
    PDFView aiq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_ai6);
        aiq=(PDFView)findViewById(R.id.qba);
        aiq.fromAsset("ai5.pdf").load();

    }
}