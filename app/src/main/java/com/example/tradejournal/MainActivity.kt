package com.example.tradejournal

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.tradejournal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val db = Mydatabase.getDb(context = this).myQuvery().getAll()
        var listmavzu = ArrayList<String>()

        for (i in db) {
            listmavzu.add(i.mavzu)

        }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,listmavzu)
        binding.ListId.adapter = adapter
        binding.ListId.setOnItemClickListener { adapterView, view, i, l ->
        val text =  db.get(i).malumot
        val intent=Intent (this,MainActivity3::class.java)
        intent.putExtra("Malumotlar",text)
        startActivity(intent)
        }
        binding.qoshishId.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}
