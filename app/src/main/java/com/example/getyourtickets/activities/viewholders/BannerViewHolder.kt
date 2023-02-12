package com.example.getyourtickets.activities.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.activities.delegates.BannerViewHolderDelegate

class BannerViewHolder(itemView: View, private val mDelegate: BannerViewHolderDelegate) :
    RecyclerView.ViewHolder(itemView) {
    init {
          itemView.setOnClickListener{
                  mDelegate.onTapCreditFromBanner()
          }
    }
}