package com.cedillo.technosoft.quote.profiled

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cedillo.technosoft.quote.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                //TODO
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_car -> {
                //TODO
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_house -> {
                //TODO
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_profiled)
        findViewById<BottomNavigationView>(R.id.navigation).setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}