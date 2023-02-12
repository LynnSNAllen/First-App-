package com.example.getyourtickets.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.acitivities.MovieDetailsActivity
import com.example.getyourtickets.activities.adapters.BannerViewAdapter
import com.example.getyourtickets.activities.delegates.BannerViewHolderDelegate
import com.example.getyourtickets.adapters.MovieAdapter
import com.example.getyourtickets.delegates.MovieViewHolderDelegate
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_home.*

open class HomeFragment : Fragment(), MovieViewHolderDelegate, BannerViewHolderDelegate {

    lateinit var mMovieAdapter: MovieAdapter
    lateinit var mBannerAdapter: BannerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpBannerViewPager()
        setUpRecyclerView()
        setUpTabLayout()
    }

    private fun setUpBannerViewPager() {
        mBannerAdapter = BannerViewAdapter(this)
        viewPagerBanner.adapter = mBannerAdapter
        dotsBannerIndicator.attachTo(viewPagerBanner)

    }

    private fun setUpTabLayout() {
        val tab = tabLayoutHome.newTab()
        tab.text = getString(R.string.lbl_now_showing)
        tabLayoutHome.addTab(tab)

        val tabSec = tabLayoutHome.newTab()
        tabSec.text = getString(R.string.lbl_coming_soon)
        tabLayoutHome.addTab(tabSec)

        tabLayoutHome.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            /**
             * Called when a tab enters the selected state.
             *
             * @param tab The tab that was selected
             */
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    when (tab.position) {
                        0 -> {
                            rvNowShowing.visibility = View.VISIBLE
                            rvComingSoon.visibility = View.GONE
                        }
                        1 -> {
                            rvComingSoon.visibility = View.VISIBLE
                            rvNowShowing.visibility = View.GONE
                        }
                    }
                }
            }

            /**
             * Called when a tab exits the selected state.
             *
             * @param tab The tab that was unselected
             */
            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

    }


    private fun setUpRecyclerView() {
        mMovieAdapter = MovieAdapter(this, false)
        rvNowShowing.adapter = mMovieAdapter
        rvNowShowing.layoutManager = GridLayoutManager(context, 2)

        mMovieAdapter = MovieAdapter(this, true)
        rvComingSoon.adapter = mMovieAdapter
        rvComingSoon.layoutManager = GridLayoutManager(context, 2)
        rvComingSoon.visibility = View.GONE
    }

    override fun onTapMovie() {
        startActivity(context?.let { MovieDetailsActivity.newIntent(it) })
    }



    override fun onTapCreditFromBanner() {

    }
}
