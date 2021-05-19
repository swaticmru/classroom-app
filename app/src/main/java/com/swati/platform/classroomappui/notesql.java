package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class notesql extends AppCompatActivity {
    PDFView ain2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notesql);
        ain2=(PDFView)findViewById(R.id.notesql);
        ain2.fromAsset("sql.pdf").load();
    }
}