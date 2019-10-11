package com.example.recyclerviewapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewapp.adapters.HobbiesAdaptor
import com.example.recyclerviewapp.models.HobbiesData
import com.example.recyclerviewapp.R
import kotlinx.android.synthetic.main.activity_hobby.*

class HobbyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView_hobby.layoutManager = layoutManager


        val adapter = HobbiesAdaptor(
            this,
            HobbiesData.Supplier.hobbies
        )
        recyclerView_hobby.adapter = adapter
    }
}
