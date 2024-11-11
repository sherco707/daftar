package com.example.tradejournal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tradejournal.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding:ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = Mydatabase.getDb(this).myQuvery()
        val message=intent.getStringExtra("malumot")
        val mavzu = intent.getStringExtra("mavzu")
        val id = intent.getIntExtra("id", 0)
        binding.textId.text=message

        binding.deletId.setOnClickListener {
            db.delet(id)

            finish()
        }

//sdfsdg
    }
}