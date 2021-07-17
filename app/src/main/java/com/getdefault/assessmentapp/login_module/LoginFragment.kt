package com.getdefault.assessmentapp.login_module

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.getdefault.assessmentapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {


    private val loginViewModel : LoginViewModel by lazy {
        val activity = requireNotNull(this.activity)
        ViewModelProvider(this, LoginViewModelProvider(activity.application)).get(LoginViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = FragmentLoginBinding.inflate(inflater)

        binding.lifecycleOwner = viewLifecycleOwner
        binding.loginViewModel = loginViewModel



        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            loginViewModel.login(email)
        }


        loginViewModel.loginError.observe(viewLifecycleOwner, {
            it?.let {
                if(it){
                    binding.tvAuthenticationErrorMsg.visibility = View.VISIBLE
                }else{
                    binding.tvAuthenticationErrorMsg.visibility = View.GONE
                }
            }
        })

        loginViewModel.loginSuccessful.observe(viewLifecycleOwner, {
            it?.let {
                if(it){
                    Toast.makeText(activity, "Login SuccessFul", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRulesFragment())
                    loginViewModel.onFinishedLogin()
                }
            }
        })

        return binding.root
    }
}