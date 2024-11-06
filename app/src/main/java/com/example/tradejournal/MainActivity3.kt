package com.example.tradejournal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tradejournal.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding:ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val message=intent.getStringExtra("Malumotlar")
        binding.textId.text=message

    }
}