package com.example.tradejournal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.tradejournal.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding:ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = Mydatabase.getDb(context = this).myQuvery()
        val message=intent.getStringExtra("Malumotlar")
        val id=intent.getStringExtra("index")

        binding.textId.text=message
        binding.OchirishId.setOnClickListener {
            val idr=(id?.toInt()?:0)+1
            Log.d("MY_TAG", "onCreate:$idr")
            db.deleteUserId(idr)
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
//s
    }
}