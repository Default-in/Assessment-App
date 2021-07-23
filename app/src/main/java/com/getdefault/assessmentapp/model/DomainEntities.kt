package com.getdefault.assessmentapp.model


data class QuestionData(
    val questionText : String,
    val codeSnippet : String,
    val imageUrl : String
)

data class DomainQuestion(
    val difficulty : Long,
    val questionDataList : List<QuestionData>,
    val answer : String
)

