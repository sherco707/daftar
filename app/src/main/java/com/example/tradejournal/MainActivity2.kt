package com.example.tradejournal

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tradejournal.databinding.ActivityMain2Binding
import com.example.tradejournal.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val db = Mydatabase.getDb(this)
        binding.saqlashbtn.setOnClickListener {
            val mavzu = binding.editId.text.toString()
            val malumot = binding.edittId.text.toString()
            val message = Message(mavzu = mavzu, malumot = malumot)
            db.myQuvery().addText(message.mavzu,message.malumot)


            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}