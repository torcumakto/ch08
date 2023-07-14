package com.example.newapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.example.newapp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loadImageButton.setOnClickListener{
            checkPermission()
        }
    }
    private fun checkPermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),REQUEST_READ_EXTERNAL_STORAGE)

    }
    private  fun loadImage() {

    }

    companion object {
        const val  REQUEST_READ_EXTERNAL_STORAGE = 100
    }
}