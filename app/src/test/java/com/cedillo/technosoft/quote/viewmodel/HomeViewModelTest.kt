package com.cedillo.technosoft.quote.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class HomeViewModelTest{
    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Test
    fun onYesClicked(){
        val viewModel = HomeViewModel()
        viewModel.onYesClick()
        assertEquals(HomeViewModel.Buttons.YES, viewModel.buttonClicked.value)
    }

    fun onNoClicked(){
        val viewModel = HomeViewModel()
        viewModel.onNoClick()
        assertEquals(HomeViewModel.Buttons.NO, viewModel.buttonClicked.value)
    }
}