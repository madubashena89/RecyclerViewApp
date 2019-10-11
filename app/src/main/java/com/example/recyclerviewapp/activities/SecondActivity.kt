package com.example.recyclerviewapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.recyclerviewapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle : Bundle? = intent.extras
        val msg = bundle!!.getString("user_messageIn")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        txvUserMsg.text = msg

        btnShareToOtherApps.setOnClickListener{
            val message = msg
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to : "))

        }
    }
}
