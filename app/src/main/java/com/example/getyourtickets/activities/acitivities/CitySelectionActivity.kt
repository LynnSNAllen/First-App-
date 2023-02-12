package com.example.getyourtickets.activities.acitivities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getyourtickets.R
import com.example.getyourtickets.acitivities.MainActivity
import com.example.getyourtickets.activities.adapters.CityAdapter
import com.example.getyourtickets.activities.delegates.CityViewHolderDelegate
import kotlinx.android.synthetic.main.activity_city_selection.*

class CitySelectionActivity : AppCompatActivity() , CityViewHolderDelegate {
    lateinit var mCityAdapter: CityAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_selection)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
         mCityAdapter = CityAdapter(this)
         rvCitySelection.adapter = mCityAdapter
        rvCitySelection.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }

    override fun ontapCity() {
       val intent = Intent(this,MainActivity ::class.java)
        startActivity(intent)
    }
}