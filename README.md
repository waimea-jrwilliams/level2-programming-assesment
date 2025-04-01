# Roller Dice Game

by Jiivahn Williams

---

This is a programming project for **NCEA Level 2**, assessed against standard [91896](docs/as91896.pdf).

The project is written in the [Kotlin](https://kotlinlang.org) programming language and demonstrates a number of **advanced programming techniques**:
- Modifying data stored in collections
- Storing multi-dimensional data in collections
- Creating functions that use parameters and/or return values
- Using non-trivial string manipulation
- Using additional non-core libraries

** EDIT LIST ABOVE TO MATCH YOUR PROJECT**

---

## Project Files

- Program source code can be found in the [src](src/) folder
- Program test plan is in [test-plan.md](docs/test-plan.md) in the docs folder
- Program test evidence is in [test-results.md](docs/test-results.md) in the docs folder

---
fun rollDice(playerName: String): Int {
println("$playerName, press Enter to roll the dice...")
readln() // Wait for user input
val roll = random.nextInt(1, 7) // Generate a number between 1 and 6
println("$playerName rolled a $roll!")
return roll
}

## Project Description

Roller dice is a two player game where there is one dice and both players take turns to roll the dice
and at the end of all the rounds the player with the most points wins



