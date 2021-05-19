package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class book4 extends AppCompatActivity {
    PDFView book_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book4);
        book_4=(PDFView)findViewById(R.id.pdf4);
        book_4.fromAsset("textbook4.pdf").load();
    }
}