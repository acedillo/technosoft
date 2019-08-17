package com.cedillo.technosoft.quote.guest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.cedillo.technosoft.quote.R
import com.cedillo.technosoft.quote.guest.repository.QuoteRepostoryImpl
import com.cedillo.technosoft.quote.guest.viewmodel.QuoteViewModel

class QuoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)
        val viewModel =
            ViewModelProviders.of(this, QuoteViewModel.getFactory(QuoteRepostoryImpl())).get(QuoteViewModel::class.java)
        viewModel.onQuoteProcessed.observe(this, Observer {
            //TODO
             })
        supportFragmentManager.beginTransaction().add(R.id.quote_container, QuoteFragment()).commit()
    }


}