package com.example.getyourtickets.activities.acitivities

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.adapters.ActorAdapter
import kotlinx.android.synthetic.main.activity_movie.*

class MovieDetailsActivity : AppCompatActivity() {


    private lateinit var  mCastAdapter : ActorAdapter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MovieDetailsActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        setUpVideoView()
        setUpListener()
//        setUpRecyclerView()
    }

    private fun setUpListener() {
//         play/pause Set up
        btnPlayTrailer.setOnClickListener {
            val isPlaying = vvMovieTrailer.isPlaying
            if (isPlaying) {
                btnPlayTrailer.setImageResource(R.drawable.ic_baseline_pause_white_24dp)
                vvMovieTrailer.pause()
            } else {
                btnPlayTrailer.setImageResource(R.drawable.ic_baseline_play_arrow_white_30dp)
                vvMovieTrailer.start()
            }
        }

//        play/pause button Set visibility
        vvMovieTrailer.setOnClickListener {
            if (btnPlayTrailer.visibility == View.VISIBLE) {
                btnPlayTrailer.visibility = View.INVISIBLE
            } else {
                btnPlayTrailer.visibility = View.VISIBLE
            }
        }
        btnBacktoHomee.setOnClickListener {
            super.onBackPressed()
        }
        btnBookingMovie.setOnClickListener {
            val intent = Intent(this, ChooseDateAndCinemaActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setUpVideoView() {

        val offlineUri =
            Uri.parse("android.resource://$packageName/${R.raw.marvelstudiosblackwidowtrailer}")
        vvMovieTrailer.setVideoURI(offlineUri)
        vvMovieTrailer.requestFocus()
        vvMovieTrailer.start()
    }

    private fun setUpRecyclerView() {
       mCastAdapter = ActorAdapter()
        rvCastView.adapter = mCastAdapter
        rvCastView.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.HORIZONTAL,false)
    }

//    private fun  {
//        btnBacktoHomee.setOnClickListener{
//           super.onBackPressed()
//        }
//        btnBookingMovie.setOnClickListener{
//            val intent = Intent(this,ChooseDateAndCinemaActivity::class.java)
//            startActivity(intent)
//        }
//
//    }
}
