package com.cedillo.technosoft.quote.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.cedillo.technosoft.quote.R
import com.cedillo.technosoft.quote.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val viewModel = ViewModelProviders.of(activity!!).get(HomeViewModel::class.java)
        view.findViewById<Button>(R.id.home_button_yes).setOnClickListener { viewModel.onYesClick() }
        view.findViewById<Button>(R.id.home_button_no).setOnClickListener { viewModel.onNoClick() }

        super.onViewCreated(view, savedInstanceState)
    }
}