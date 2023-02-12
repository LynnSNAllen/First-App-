package com.example.getyourtickets.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.delegates.CityViewHolderDelegate
import com.example.getyourtickets.activities.viewholders.CityViewHolder

class CityAdapter(private val delegate: CityViewHolderDelegate) : RecyclerView.Adapter<CityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
      val view : View =  LayoutInflater.from(parent.context).inflate(R.layout.view_holder_city,parent,false)
        return CityViewHolder(view,delegate)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 1
    }
}