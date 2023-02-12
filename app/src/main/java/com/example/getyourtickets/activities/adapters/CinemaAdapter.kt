package com.example.getyourtickets.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.viewholders.CinemaViewHolder

class CinemaAdapter : RecyclerView.Adapter<CinemaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_cinema, parent, false)
        return CinemaViewHolder(view)
    }


    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {

    }


    override fun getItemCount(): Int {
        return 10
    }
}