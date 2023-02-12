package com.example.getyourtickets.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.delegates.BannerViewHolderDelegate
import com.example.getyourtickets.activities.viewholders.BannerViewHolder

class BannerViewAdapter(val mDelegate: BannerViewHolderDelegate) : RecyclerView.Adapter<BannerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_banner, parent, false)
        return BannerViewHolder(view, mDelegate)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }


}