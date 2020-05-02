package com.abhinav.studymaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CPrograming extends AppCompatActivity {

    PDFView Cprograming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprograming);

        Cprograming=(PDFView) findViewById(R.id.pdfBook2);

        Cprograming.fromAsset("C.pdf").load();
    }
}
