package com.example.tradejournal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tradejournal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var daftarAdapter: DaftarAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val db = Mydatabase.getDb(context = this).myQuvery().getAll()
        daftarAdapter = DaftarAdapter(db, {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("malumot", it.malumot)
            intent.putExtra("mavzu", it.mavzu)
            intent.putExtra("id", it.id)
            startActivity(intent)
        })


        binding.RececlerId.adapter = daftarAdapter

        binding.qoshishBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}
