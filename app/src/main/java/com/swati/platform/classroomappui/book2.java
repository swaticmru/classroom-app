package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;


public class book2 extends AppCompatActivity {
    PDFView book_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);
        book_2=(PDFView)findViewById(R.id.pdf2);
        book_2.fromAsset("textbook2.pdf").load();
    }
}