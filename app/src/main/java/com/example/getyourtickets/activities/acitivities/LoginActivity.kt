package com.example.getyourtickets.acitivities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.getyourtickets.R
import com.example.getyourtickets.activities.acitivities.OtpCodeActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnVerifyPhoneNo.setOnClickListener {
            val intent = Intent(this, OtpCodeActivity::class.java)
             startActivity(intent)
        }

    }
}