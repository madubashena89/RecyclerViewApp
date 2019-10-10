package com.example.recyclerviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_items_hobby.view.*

class HobbiesAdaptor (val context : Context, val hobbies : List<HobbiesData>): RecyclerView.Adapter<HobbiesAdaptor.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val view = LayoutInflater.from(context).inflate(R.layout.list_items_hobby, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    inner class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){

        fun setData(hobby : HobbiesData?, postn : Int){
            itemView.txvTitle.text = hobby!!.title
        }

    }
}