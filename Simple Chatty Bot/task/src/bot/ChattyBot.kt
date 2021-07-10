package bot

class ChattyBot(val name: String, val birthYear: Int) {
    fun introduce(){
        ROBOT_HI_NAME.plus(name).let(::println)
        ROBOT_HI_BIRTH.plus(birthYear).let(::println)
    }

    fun whatsYourName(){
        ROBOT_WANT_UR_NAME.let(::println)
        ROBOT_SAY_UR_NAME.plus(readLine()!!).plus('!').let(::println)
    }

    fun guessYourAge(){
        ROBOT_ASK_UR_AGE.let(::println)
        ROBOT_ASK_UR_AGE_REMINDERS.let(::println)
        Array(3){ readLine()!!.toInt() }
            .run { (get(0) * 70 + get(1) * 21 + get(2) * 15) % 105 }
            .let(ROBOT_GUESS_UR_AGE).let(::println)
    }

    fun countTo(){
        ROBOT_CHALLENGE_U.let(::println)
        (0..readLine()!!.toInt()).map(ROBOT_COUNT).forEach(::println)
        ROBOT_WISH_U_NICE_DAY.let(::println)
    }

    fun askQuestion(){
        var rightAnswer = false
        ROBOT_TEST_KNOWLEDGE.let(::println)
        ROBOT_ASK_METHODS.let(::println)
        ROBOT_OPTIONS_Q1.forEach(::println)

        rightAnswer = readLine()!! == CORRECT_ANSWER_Q1
        while (!rightAnswer){
            TRY_AGAIN.let(::println)
            rightAnswer = readLine()!! == CORRECT_ANSWER_Q1
        }

        GOODBYE.let(::println)
    }
}