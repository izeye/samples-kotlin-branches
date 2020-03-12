package languageguide.gettingstarted.idioms

fun main() {
    println(transform("Red"))
    println(transform("Green"))
    println(transform("Blue"))
    println(transform("Black"))
}

fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value.")
    }
}
