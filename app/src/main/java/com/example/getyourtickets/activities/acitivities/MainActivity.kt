package com.example.getyourtickets.acitivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.getyourtickets.R
import com.example.getyourtickets.fragments.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav.setOnNavigationItemSelectedListener { menuItem : MenuItem ->
            when(menuItem.itemId){
                R.id.actionMovies -> {
                    viewPager.currentItem = 0
                }
                R.id.actionCinema -> {
                    viewPager.currentItem = 1
                }
                R.id.actionTicket -> {
                    viewPager.currentItem = 2
                }
                R.id.actionProfile -> {
                    viewPager.currentItem = 3
                }
            }
            true
        }
         supportFragmentManager.beginTransaction()
             .add(R.id.fragmentHomeContainer,HomeFragment())
             .commit()
    }

}