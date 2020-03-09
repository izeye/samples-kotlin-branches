package languageguide.gettingstarted.idioms

import java.lang.IllegalArgumentException

fun main() {
    println(theAnswer())
    println(theAnswerShorter())
    println(transformShorter("Red"))
}

fun theAnswer(): Int {
    return 42
}

fun theAnswerShorter() = 42

fun transformShorter(color: String): Int = when(color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value.")
}
