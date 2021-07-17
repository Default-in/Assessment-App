package com.getdefault.assessmentapp.finish_module

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.getdefault.assessmentapp.databinding.FragmentFinishBinding

class FinishFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFinishBinding.inflate(inflater)
        return binding.root
    }
}