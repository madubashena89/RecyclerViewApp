package com.example.recyclerviewapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendMsgNextAct.setOnClickListener{
            val message = etUserMessage.text.toString()
            Log.i("MainAct", "$message")
            showToast("Button was clicked !")
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
