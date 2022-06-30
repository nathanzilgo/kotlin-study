@file:Suppress("NAME_SHADOWING")

/**
 *  Created by @zilgo
 *  30/06/2022
 */

fun main(args: Array<String>) {
    val pArgs: String = args.joinToString().ifBlank { "empty" }
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Eai mizera\n" +
            "Program arguments: [${pArgs}]")

    val usrIn = readLine() ?: "empty input"
    println("sorted digits: ${usrIn.filter { it.isDigit() }}")

    val usr = User("zilgo",
        "stardust",
        24,
        "adm",
        "my name is yoshikage kira..."
    )
    println("User ${usr.nickname} has ${usr.countBits()} bits of variables")
}