package com.example.dotspace.ui.about_us

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dotspace.R
import com.github.barteksc.pdfviewer.PDFView

class PdfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        val pdfView: PDFView = findViewById(R.id.pdfview)
        pdfView.fromAsset("dot_faqs.pdf").load()
    }
}