package com.example.getyourtickets.activities.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.activities.delegates.CityViewHolderDelegate

class CityViewHolder(itemView: View , private val delegate: CityViewHolderDelegate) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener{
            delegate.ontapCity()
        }
    }
}