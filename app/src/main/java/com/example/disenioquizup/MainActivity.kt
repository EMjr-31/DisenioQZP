package com.example.disenioquizup

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById<RecyclerView>(R.id.contenedor_evaluaciones)
        val adaptador= AdaptadorEvaluaciones1()
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adaptador
    }
}