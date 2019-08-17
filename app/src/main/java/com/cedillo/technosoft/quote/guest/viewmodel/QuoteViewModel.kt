package com.cedillo.technosoft.quote.guest.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cedillo.technosoft.quote.guest.repository.QuoteRepository

class QuoteViewModel(val quoteRepository : QuoteRepository) : ViewModel() {

    private val _onQuoteProcessed = MutableLiveData<Boolean>()

    val onQuoteProcessed : LiveData<Boolean>
    get() = _onQuoteProcessed

    companion object {
        fun getFactory(repository: QuoteRepository): ViewModelProvider.Factory {
            return object : ViewModelProvider.Factory {
                override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                    return QuoteViewModel(repository) as T
                }
            }
        }
    }

    fun processQuote(){
        _onQuoteProcessed.postValue(quoteRepository.getQuote() == 1.0)
    }
}