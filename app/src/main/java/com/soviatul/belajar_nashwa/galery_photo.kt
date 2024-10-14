package com.soviatul.belajar_nashwa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.soviatul.belajar_nashwa.adapter.photoadapter

class galery_photo : AppCompatActivity() {
    private var imageList = arrayOf(
        R.drawable.bing,
        R.drawable.mesin,
        R.drawable.ti,
        R.drawable.sipil,
        R.drawable.elektro,
        R.drawable.akutansi
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galery_photo)

        val gridView = findViewById<GridView>(R.id.grid)
        val adapter= photoadapter(this, imageList)

        gridView.adapter=adapter

        gridView.setOnClickListener(){
            val intent=Intent(this,photo_detail::class.java)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}