package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class notesAi extends AppCompatActivity {
    PDFView ais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_ai);

        ais=(PDFView)findViewById(R.id.aiSyll);
        ais.fromAsset("ai1.pdf").load();

    }
}