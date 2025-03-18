/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Old Gold
 * Project Author: Jiivahn Williams
 * GitHub Repo:    https://github.com/waimea-jrwilliams/level2-programming-assesment
 * ---------------------------------------------------------------------
 * Notes:Old gold is a game with two players,
 * its played on a one-dimensional grid with coins,
 * where the aim is to win by being the player who
 * removes the gold coin.
 * PROJECT NOTES HERE
 * =====================================================================
 */



fun main() {
    println("------------")
    println("  Old Gold")
    println("------------")
    println()

    val playerName1 = getString("Please enter player 1's name: ")
    println("Hello, nice to meet you $playerName1")

    val playerName2 = getString("Please enter player 2's name: ")
    println("Hello, nice to meet you $playerName2")

}

fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank())
            break

    }
    return userInput
}