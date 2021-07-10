package bot

fun main() {
    with(ChattyBot(ROBOT_NAME, ROBOT_BIRTH)){
        introduce()
        whatsYourName()
        guessYourAge()
        countTo()
        askQuestion()
    }
}
