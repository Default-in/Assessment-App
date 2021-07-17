package com.getdefault.assessmentapp.rules_module

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.getdefault.assessmentapp.R
import com.getdefault.assessmentapp.databinding.FragmentRulesBinding

class RulesFragment : Fragment() {

    private val rulesViewModel : RulesViewModel by lazy {
        val activity = requireNotNull(this.activity)
        ViewModelProvider(this, RulesViewModelProvider(activity.application)).get(RulesViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentRulesBinding.inflate(inflater)

        binding.rulesViewModel = rulesViewModel
        binding.lifecycleOwner = viewLifecycleOwner


        val rulesList = resources.getStringArray(R.array.rules_list)
        val adapter = RulesListAdapter(rulesList)
        binding.rvRulesList.adapter = adapter


        return binding.root
    }



}

