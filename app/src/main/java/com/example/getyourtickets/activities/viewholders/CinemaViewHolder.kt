package com.example.getyourtickets.activities.viewholders

import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.activities.adapters.TimeAdapter
import kotlinx.android.synthetic.main.view_holder_cinema.view.*
import kotlinx.android.synthetic.main.view_holder_time.view.*

class CinemaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var mTimeAdapter: TimeAdapter ?= null
    var isVisibleTimeRecycler : Boolean = false
        init {
            itemView.apply {
                btnSeeDetails.setOnClickListener {
                   if(isVisibleTimeRecycler) {
                       rvTime.visibility = View.GONE
                       itemView.ivLongPress.visibility = View.GONE
                       mTimeAdapter = null
                       isVisibleTimeRecycler = false
                   }
                    else{
                        rvTime.visibility = View.VISIBLE
                        itemView.ivLongPress.visibility = View.VISIBLE
                       setUpTimeRecyclerView()
                       isVisibleTimeRecycler = true
                    }
                }
            }
        }

    private fun setUpTimeRecyclerView() {
         mTimeAdapter = TimeAdapter()
         itemView.rvTime.adapter = mTimeAdapter
         itemView.rvTime.layoutManager = GridLayoutManager(itemView.context,3,GridLayoutManager.VERTICAL,false)
    }


}