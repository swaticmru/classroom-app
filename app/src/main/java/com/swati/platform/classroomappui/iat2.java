package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class iat2 extends AppCompatActivity {
    PDFView ain2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iat2);
        ain2=(PDFView)findViewById(R.id.iat2);
        ain2.fromAsset("iat2.pdf").load();
    }
}