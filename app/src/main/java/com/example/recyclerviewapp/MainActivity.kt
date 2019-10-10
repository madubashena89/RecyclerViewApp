package com.example.recyclerviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendMsgNextAct.setOnClickListener{
            val message = etUserMessage.text.toString()
            Log.i("MainAct", "$message")
            //explicit intent to pass message to second activity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_messageIn", message)
            startActivity(intent)

        }

        btnRecyclerViewDemo.setOnClickListener{
            val intentRecy = Intent(this, HobbyActivity::class.java)
            startActivity(intentRecy)
        }
    }
}
