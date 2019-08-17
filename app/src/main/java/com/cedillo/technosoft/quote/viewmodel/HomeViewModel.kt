package com.cedillo.technosoft.quote.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel(){

    private val _buttonClicked = MutableLiveData<Buttons>()

    val buttonClicked: LiveData<Buttons>
        get() = _buttonClicked

    fun onYesClick() {
        _buttonClicked.postValue(Buttons.YES)
    }

    fun onNoClick() {
        _buttonClicked.postValue(Buttons.NO)
    }

    enum class Buttons {
        YES,
        NO
    }
}