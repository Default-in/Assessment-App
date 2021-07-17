package com.getdefault.assessmentapp.login_module

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val _email = MutableLiveData<String>()
    val email : LiveData<String>
        get() = _email


    private val _loginBtnPressed = MutableLiveData(false)
    val loginBtnPressed : LiveData<Boolean>
        get() = _loginBtnPressed


    private val _loginError = MutableLiveData(false)
    val loginError : LiveData<Boolean>
        get() = _loginError


    private val _loginSuccessful = MutableLiveData(false)
    val loginSuccessful : LiveData<Boolean>
        get() = _loginSuccessful


    fun login(){

    }
}


