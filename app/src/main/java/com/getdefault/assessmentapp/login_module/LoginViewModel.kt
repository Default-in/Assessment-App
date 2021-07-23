package com.getdefault.assessmentapp.login_module

import android.app.Application
import android.text.Editable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.getdefault.assessmentapp.network.Api
import com.getdefault.assessmentapp.network.User
import kotlinx.coroutines.launch
import java.lang.Exception

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val _loginError = MutableLiveData(false)
    val loginError : LiveData<Boolean>
        get() = _loginError


    private val _loginSuccessful = MutableLiveData(false)
    val loginSuccessful : LiveData<Boolean>
        get() = _loginSuccessful

    private val _user = MutableLiveData<User>()
    val user : LiveData<User>
        get() = _user



    fun login(email: String){
//        if(email == "saurav.kalsoor@gmail.com"){
//            _loginSuccessful.value = true
//            _loginError.value = false
//        }else{
//            _loginError.value = true
//        }
        viewModelScope.launch {
            try{
                _user.value = Api.retrofitService.authenticateLogin(email)
                _loginSuccessful.value = true
                _loginError.value = false
            }catch (e : Exception){
                _loginError.value = true
            }
        }

    }

    fun onFinishedLogin(){
        _loginSuccessful.value = false
    }
}


