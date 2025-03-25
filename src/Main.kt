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
    println("-------------------------------------------------------")
    println(" ____            ___    ___                   \n" +
            "/\\  _`\\         /\\_ \\  /\\_ \\                  \n" +
            "\\ \\ \\L\\ \\    ___\\//\\ \\ \\//\\ \\      __   _ __  \n" +
            " \\ \\ ,  /   / __`\\\\ \\ \\  \\ \\ \\   /'__`\\/\\`'__\\\n" +
            "  \\ \\ \\\\ \\ /\\ \\L\\ \\\\_\\ \\_ \\_\\ \\_/\\  __/\\ \\ \\/ \n" +
            "   \\ \\_\\ \\_\\ \\____//\\____\\/\\____\\ \\____\\\\ \\_\\ \n" +
            "    \\/_/\\/ /\\/___/ \\/____/\\/____/\\/____/ \\/_/ \n" +
            "                                              \n" +
            "                                              \n" +
            " ____                                         \n" +
            "/\\  _`\\   __                                  \n" +
            "\\ \\ \\/\\ \\/\\_\\    ___     __                   \n" +
            " \\ \\ \\ \\ \\/\\ \\  /'___\\ /'__`\\                 \n" +
            "  \\ \\ \\_\\ \\ \\ \\/\\ \\__//\\  __/                 \n" +
            "   \\ \\____/\\ \\_\\ \\____\\ \\____\\                \n" +
            "    \\/___/  \\/_/\\/____/\\/____/                ")
    println("-------------------------------------------------------")
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

    // Here it shows the rules of the game
    println("Roller dice is a two player game where there is one dice and both" +
            " players take turns to roll the dice and at the end of all the rounds the player with the most points wins")
    println("The way the points work are simple: A dice has numbers from 1 - 6 " +
            "whatever dice number you land on is the number of points you get")

    println()
    println("Lets get started!")
    println()
    println("Player one it is your turn to roll")
    println("Type 'X' to roll")

    val input = readLine()

    if (input == "X" || input == "x") {
        println("Rolling the dice...")
        // Add your dice roll logic here
    } else {
        println("Invalid input. Please type 'X' to roll.")
    }



    // Create a list
    val dices = mutableListOf<String>()

    println(dices)

    // Add some things
    dices.add("1")
    dices.add("2")
    dices.add("3")
    dices.add("4")
    dices.add("5")
    dices.add("6")

    // Shuffle the list (randomise)
    dices.shuffle()
    println(dices)

    // Get a random item from list
    val item = dices.random()
    println("Random item: $item")




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