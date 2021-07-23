package com.getdefault.assessmentapp.quiz_module

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.getdefault.assessmentapp.databinding.FragmentQuizBinding
import kotlinx.android.synthetic.main.item_question_layout.view.*

class QuizFragment : Fragment() {

    private val quizViewModel : QuizViewModel by lazy {
        val activity = requireNotNull(this.activity)
        ViewModelProvider(this, QuizViewModelProvider(activity.application)).get(QuizViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentQuizBinding.inflate(inflater)


        return binding.root
    }
}