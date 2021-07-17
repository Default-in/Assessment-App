package com.getdefault.assessmentapp.login_module

import android.app.Application
import android.text.Editable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val _loginError = MutableLiveData(false)
    val loginError : LiveData<Boolean>
        get() = _loginError


    private val _loginSuccessful = MutableLiveData(false)
    val loginSuccessful : LiveData<Boolean>
        get() = _loginSuccessful


    fun login(email: String){
        if(email == "saurav.kalsoor@gmail.com"){
            _loginSuccessful.value = true
            _loginError.value = false
        }else{
            _loginError.value = true
        }

    }

    fun onFinishedLogin(){
        _loginSuccessful.value = false
    }
}


