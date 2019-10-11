package com.example.recyclerviewapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.models.HobbiesData
import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.showToast
import kotlinx.android.synthetic.main.list_items_hobby.view.*

class HobbiesAdaptor (val context : Context, private val hobbies : List<HobbiesData>): RecyclerView.Adapter<HobbiesAdaptor.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_items_hobby, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    inner class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){

        var currentHobby : HobbiesData? = null
        var currentPosition : Int = 0

        init {
            itemView.setOnClickListener {
                context.showToast(currentHobby!!.title + "Clicked")
            }
            itemView.image_share.setOnClickListener{
                val message = "My hobby is " + currentHobby!!.title
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"
                context.startActivity(Intent.createChooser(intent, "Share to : "))
            }

        }
        fun setData(hobby : HobbiesData?, postn : Int){
            itemView.txvTitle.text = hobby!!.title

            this.currentHobby = hobby
            this.currentPosition = postn
        }

    }
}