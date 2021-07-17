package com.getdefault.assessmentapp.rules_module

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class RulesViewModelProvider(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(RulesViewModel::class.java))
            return RulesViewModel(application) as T
        throw IllegalArgumentException("ViewModel cannot be created")
    }
}