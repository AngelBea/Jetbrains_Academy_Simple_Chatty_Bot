package bot

const val ROBOT_HI_NAME = "Hello! My name is "
const val ROBOT_HI_BIRTH = "I was created in "
const val ROBOT_WANT_UR_NAME = "Please, remind me your name."
const val ROBOT_SAY_UR_NAME = "What a great name you have, "
const val ROBOT_ASK_UR_AGE = "Let me guess your age."
const val ROBOT_ASK_UR_AGE_REMINDERS = "Enter remainders of dividing your age by 3, 5 and 7."
val ROBOT_GUESS_UR_AGE = { num: Int -> "Your age is $num; that's a good time to start programming!" }
val ROBOT_COUNT = { num: Int -> "$num!" }
const val ROBOT_CHALLENGE_U = "Now I will prove to you that I can count to any number you want."
const val ROBOT_WISH_U_NICE_DAY = "Completed, have a nice day!"
const val ROBOT_TEST_KNOWLEDGE = "Let's test your programming knowledge."
const val ROBOT_ASK_METHODS = "Why do we use methods?"
private const val ROBOT_ASK_OP1 = "1. To repeat a statement multiple times."
private const val ROBOT_ASK_OP2 = "2. To decompose a program into several small subroutines."
private const val ROBOT_ASK_OP3 = "3. To determine the execution time of a program."
private const val ROBOT_ASK_OP4 = "4. To interrupt the execution of a program."
val ROBOT_OPTIONS_Q1 = listOf<String>(ROBOT_ASK_OP1, ROBOT_ASK_OP2, ROBOT_ASK_OP3, ROBOT_ASK_OP4)
const val TRY_AGAIN = "Please, try again."
const val CORRECT_ANSWER_Q1 = "4"
const val GOODBYE = "Congratulations, have a nice day!"
const val ROBOT_NAME = "Aid"
const val ROBOT_BIRTH = 2020