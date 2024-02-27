package com.example.whatsappscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsappscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var layout = arrayListOf(R.layout.fragment_chat,
        R.layout.fragment_status,
        R.layout.fragment_call)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}