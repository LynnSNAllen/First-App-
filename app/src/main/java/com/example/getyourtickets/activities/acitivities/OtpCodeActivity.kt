package com.example.getyourtickets.activities.acitivities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.getyourtickets.R
import kotlinx.android.synthetic.main.activity_optcode.*

class OtpCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_optcode)

        btnBack.setOnClickListener{
            super.onBackPressed()
        }

        btnComfirmOtp.setOnClickListener {
            val intent = Intent(this,CitySelectionActivity ::class.java)
            startActivity(intent)
        }

    }
}