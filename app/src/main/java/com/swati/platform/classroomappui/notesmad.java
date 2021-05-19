package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class notesmad extends AppCompatActivity {
    PDFView ain2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notesmad);
        ain2=(PDFView)findViewById(R.id.notesmad);
        ain2.fromAsset("mad.pdf").load();
    }
}