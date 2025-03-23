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


/**
 * This is the entry point for the program
 */
fun main() {
    println("------------")
    println("  Roller Dice")
    println("------------")
    println()

    // Ask for player names
    println("You are player 1.")
    val playerName1 = getString("Please enter player 1's name: ")

    println("Next is player 2's name.")
    val playerName2 = getString("Please enter player 2's name: ")

    println("Hello, nice to meet you $playerName1 and $playerName2")

    // Ask if they want to play the game
    println("Would you like to play this game? (yes/no)")
    val userResponse = readln()

    if (userResponse == "yes") {
        println("Great! Let's start the game.")
        // Start the game
    } else {
        println("Maybe next time!")
        return
    }

    println("Roller dice is a two player game where there is one dice and both players take turns to roll the dice and at the end of all the rounds the player with the most points wins")
    println("The way the points work are simple: A dice has numbers from 1 - 6 whatever dice number you land on is the number of points you get")

    // Set up scores
    var score1 = 0
    var score2 = 0
    val rounds = 5 // Number of rounds


}

/**
 * Function to get a string from a user
 */
fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)
        userInput = readLine() ?: ""
        if (userInput.isNotBlank())
            break
    }
    return userInput
}