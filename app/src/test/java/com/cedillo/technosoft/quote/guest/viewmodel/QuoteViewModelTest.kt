package com.cedillo.technosoft.quote.guest.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.cedillo.technosoft.quote.guest.repository.QuoteRepository
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

class QuoteViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Test
    fun processQuote() {
        val positive = object : QuoteRepository{
            override fun getQuote(): Double {
                return 1.0
            }
        }


        val positiveModel = QuoteViewModel(positive)
        positiveModel.processQuote()
        assertTrue(positiveModel.onQuoteProcessed.value!!)

        val negative = object : QuoteRepository{
            override fun getQuote(): Double {
                return 0.0
            }
        }


        val negativeModel = QuoteViewModel(negative)
        negativeModel.processQuote()
        assertFalse(negativeModel.onQuoteProcessed.value!!)
    }
}