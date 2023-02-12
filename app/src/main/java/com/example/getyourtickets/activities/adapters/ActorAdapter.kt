package com.example.getyourtickets.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.viewholders.ActorViewHolder

class ActorAdapter : RecyclerView.Adapter<ActorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {

        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_actor_list,parent,false)
        return ActorViewHolder(view)
    }


    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 9
    }

}