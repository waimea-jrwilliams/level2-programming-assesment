/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Roller Dice
 * Project Author: Jiivahn Williams
 * GitHub Repo:    https://github.com/waimea-jrwilliams/level2-programming-assesment
 * ---------------------------------------------------------------------
 * Notes: Roller Dice is a two-player game where there is one die and both players
 * take turns to roll the dice. At the end of all the rounds, the player with the
 * most points wins.
 * =====================================================================
 */

// Create a list of dice values
val dices = mutableListOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")

fun main() {
    println("+-------------------------------------------------------+")
    println(" ____       _ _             ____  _          \n" +
            "|  _ \\ ___ | | | ___ _ __  |  _ \\(_) ___ ___ \n" +
            "| |_) / _ \\| | |/ _ \\ '__| | | | | |/ __/ _ \\\n" +
            "|  _ < (_) | | |  __/ |    | |_| | | (_|  __/\n" +
            "|_| \\_\\___/|_|_|\\___|_|    |____/|_|\\___\\___|")
    println("+-------------------------------------------------------+")
    println("+-------------------------------------------------------+")
    println("INSTRUCTIONS")
    println("The game is called Roller Dice")
    println("There is two players player 1 & player 2.")
    println("player one rolls the die to see what number they get")
    println("The dice consists of numbers from one to thirty five,")
    println("whatever number it lands on would add to your points. ")
    println("It goes on until one player loses to the other person")
    println("get the most points in ten rounds to win the game!.")
    println("+-------------------------------------------------------+")

    // Ask if they want to play the game
    println("Would you like to play this game? (yes/no)")
    val userResponse = readln()

    if (userResponse == "yes") {
        println("Great lets start shall we!.")

    // Ask for player names
    println("You are player 1.")
    val userName1 = getString("Please enter player 1's name: ")

    println("Next is player 2's name.")
    val userName2 = getString("Please enter player 2's name: ")

    println("Hello, nice to meet you $userName1 and $userName2")
    println("Loading the game...")

        // Initialize scores
        var score1 = 0
        var score2 = 0

        // Play 8 rounds
        for (round in 1..10) {
           println("\n+--- Round $round ---+")

            // Player 1's Turn
            score1 += rollDice(userName1)

            // Player 2's Turn
            score2 += rollDice(userName2)

            // Display the scores after each round
            println("\nScores after Round $round:")
            println("$userName1: $score1 points")
            println("$userName2: $score2 points")
        }

        //Declare the winner
        println("\nFinal Scores:")
        println("$userName1: $score1 points")
        println("$userName2: $score2 points")

        if (score1 > score2) {
            println("The winner is: $userName1!")
        } else if (score2 > score1) {
            println("The winner is: $userName2!")
        } else {
            println("It's a tie!")
        }
    } else {
        println("Maybe next time!")
   }
   println("I hope you have had fun playing Roller Dice.")
   println("If you have any tips for the game see Jiivahn Williams the creator")
   println("For now be sure to leave a five star review, Thank you and Goodbye")

    // Create a list
    val dices = mutableListOf<String>()

    // Add some things
    dices.add("1")
    dices.add("2")
    dices.add("3")
    dices.add("4")
    dices.add("5")
    dices.add("6")
    dices.add("7")
    dices.add("8")
    dices.add("9")
    dices.add("10")
    dices.add("11")
    dices.add("12")
    dices.add("13")
    dices.add("14")
    dices.add("15")
    dices.add("16")
    dices.add("17")
    dices.add("18")
    dices.add("19")
    dices.add("20")
}

/**
 * Function to get a string from a user
 */
fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)
        userInput = readlnOrNull() ?: ""
        if (userInput.isNotBlank())
            break
    }
    return userInput
}
/**
 * Function to get the dice roll system
 */
fun rollDice(userName: String): Int {
    print("$userName, Please type 'r' to roll ")
    readln() // Wait for the users input
    val roll = dices.random().toInt() // Get a random number between 1 - 15
    println("$userName rolled a $roll")
    return roll
}