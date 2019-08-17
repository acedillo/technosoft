package com.cedillo.technosoft.quote.home

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.cedillo.technosoft.quote.R
import com.cedillo.technosoft.quote.guest.QuoteActivity
import com.cedillo.technosoft.quote.viewmodel.HomeViewModel
import com.cedillo.technosoft.quote.profiled.ProfileActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.supportActionBar!!.hide()
        setContentView(R.layout.activity_home)

        val viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        viewModel.buttonClicked.observe(this, Observer {
            when(it!!){
                HomeViewModel.Buttons.YES -> startActivity(Intent(this, ProfileActivity::class.java))
                HomeViewModel.Buttons.NO -> startActivity(Intent(this, QuoteActivity::class.java))
            }
        })
        supportFragmentManager.beginTransaction().add(R.id.home_fragment_container, HomeFragment()).commit()
    }
}
