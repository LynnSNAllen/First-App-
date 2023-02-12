package com.example.getyourtickets.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.viewholders.TimeViewHolder

class TimeAdapter : RecyclerView.Adapter<TimeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder_time, parent, false)
        return TimeViewHolder(view)
    }


    override fun onBindViewHolder(holder: TimeViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}