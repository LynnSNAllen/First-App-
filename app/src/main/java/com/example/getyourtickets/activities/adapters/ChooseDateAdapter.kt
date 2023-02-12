package com.example.getyourtickets.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.viewholders.ChooseDateViewHolder

class ChooseDateAdapter : RecyclerView.Adapter<ChooseDateViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChooseDateViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_choose_dates, parent, false)
        return ChooseDateViewHolder(view)
    }


    override fun onBindViewHolder(holder: ChooseDateViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 7
    }
}