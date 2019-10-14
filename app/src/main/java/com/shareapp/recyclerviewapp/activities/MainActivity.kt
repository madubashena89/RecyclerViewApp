package com.shareapp.recyclerviewapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shareapp.recyclerviewapp.Constants
import com.shareapp.recyclerviewapp.R
import com.shareapp.recyclerviewapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        val TAG : String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendMsgNextAct.setOnClickListener{
            val message = etUserMessage.text.toString()
            Log.i(TAG, "$message")
            showToast(resources.getString(R.string.button_was_clicked))
            //explicit intent to pass message to second activity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MSG_Key, message)
            startActivity(intent)

        }

        btnRecyclerViewDemo.setOnClickListener{
            val intentRecy = Intent(this, HobbyActivity::class.java)
            startActivity(intentRecy)
        }
    }
}
