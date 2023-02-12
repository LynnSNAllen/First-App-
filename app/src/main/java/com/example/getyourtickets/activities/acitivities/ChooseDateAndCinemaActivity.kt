package com.example.getyourtickets.activities.acitivities

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.adapters.ChooseDateAdapter
import com.example.getyourtickets.activities.adapters.CinemaAdapter
import kotlinx.android.synthetic.main.activity_choose_date_and_cinema.*

class ChooseDateAndCinemaActivity : AppCompatActivity() {
    lateinit var mChooseDateAdapter: ChooseDateAdapter
    lateinit var mCinemaAdapter: CinemaAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_date_and_cinema)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
            mChooseDateAdapter = ChooseDateAdapter()
            rvDateToChoose.adapter = mChooseDateAdapter
            rvDateToChoose.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.HORIZONTAL,false)

            mCinemaAdapter = CinemaAdapter()
            rvCinemaView.adapter = mCinemaAdapter
            rvCinemaView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


    }
}