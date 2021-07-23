package com.getdefault.assessmentapp.quiz_module

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class QuizViewModelProvider(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(QuizViewModel::class.java))
            return QuizViewModel(application) as T
        throw IllegalArgumentException("ViewModel cannot be created")
    }
}