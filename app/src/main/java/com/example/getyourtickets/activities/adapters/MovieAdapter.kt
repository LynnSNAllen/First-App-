package com.example.getyourtickets.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getyourtickets.R
import com.example.getyourtickets.delegates.MovieViewHolderDelegate
import com.example.getyourtickets.fragments.HomeFragment
import com.example.getyourtickets.viewholders.MovieViewHolder

class MovieAdapter(
    private val mDelegate: MovieViewHolderDelegate,
    private val comingSoon: Boolean
) : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_movie_list, parent, false)
        return MovieViewHolder(view, mDelegate)

    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}


