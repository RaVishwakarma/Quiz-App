package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val ques1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Austria", "Armenia",
            1
        )
        questionsList.add(ques1)

        val ques2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia", "Austria", "Germany",
            2
        )
        questionsList.add(ques2)

        val ques3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Brazil", "Denmark", "Austria", "Belgium",
            4
        )
        questionsList.add(ques3)

        val ques4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Fiji", "Kuwait", "Berlin",
            1
        )
        questionsList.add(ques4)

        val ques5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Germany", "Australia", "Denmark", "India",
            3
        )
        questionsList.add(ques5)

        val ques6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji", "Kuwait", "Austria", "Armenia",
            1
        )
        questionsList.add(ques6)

        val ques7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Kuwait", "Germany", "Austria", "India",
            2
        )
        questionsList.add(ques7)

        val ques8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Australia", "New Zealand", "Armenia",
            1
        )
        questionsList.add(ques8)

        val ques9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "New Zealand", "Kuwait", "Denmark", "Armenia",
            2
        )
        questionsList.add(ques9)

        val ques10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Brazil", "Australia", "Austria", "New Zealand",
            4
        )
        questionsList.add(ques10)

        return questionsList
    }

}