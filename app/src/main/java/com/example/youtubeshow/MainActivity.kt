package com.example.youtubeshow

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler_view=findViewById<RecyclerView>(R.id.myrecyclerview)

        // this creates a vertical layout Manager
        recycler_view.layoutManager = LinearLayoutManager(this)

        //creates an adapter
        recycler_view.adapter=MainAdapter()

    }
}