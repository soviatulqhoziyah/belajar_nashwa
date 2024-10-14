package com.soviatul.belajar_nashwa

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class photo_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_photo_detail)

        val imageView = findViewById<ImageView>(R.id.detailImageView)

        // Ambil data gambar dari Intent
        val imageResId = intent.getIntExtra("imageResId", 0)

        // Set gambar di ImageView
        if (imageResId != 0) {
            imageView.setImageResource(imageResId)
        }
    }
}