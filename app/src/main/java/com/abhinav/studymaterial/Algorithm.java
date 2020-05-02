package com.abhinav.studymaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Algorithm extends AppCompatActivity {
    PDFView Algorithm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm);

        Algorithm=(PDFView) findViewById(R.id.pdfBook1);

        Algorithm.fromAsset("Algo.pdf").load();
    }
}
