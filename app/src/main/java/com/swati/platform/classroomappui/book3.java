package com.swati.platform.classroomappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.swati.platform.classroomappui.R;

public class book3 extends AppCompatActivity {
    PDFView book_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);
        book_3=(PDFView)findViewById(R.id.pdf3);
        book_3.fromAsset("textbook3.pdf").load();
    }
}