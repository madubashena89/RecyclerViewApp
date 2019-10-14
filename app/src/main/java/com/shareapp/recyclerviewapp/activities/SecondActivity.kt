package com.shareapp.recyclerviewapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shareapp.recyclerviewapp.Constants
import com.shareapp.recyclerviewapp.R
import com.shareapp.recyclerviewapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    companion object{
        val TAG:String = SecondActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Safe call ?.
        //Safe Call with ?.let{}
        val bundle : Bundle? = intent.extras
        val msg = bundle!!.getString(Constants.USER_MSG_Key)
        bundle?.let {
            showToast(msg!!)
            //Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
            txvUserMsg.text = msg
        }


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
