package languageguide.gettingstarted.idioms

fun main() {
    println(toString(1))
    println(toString(2))
    println(toString(3))
    println(toString(4))
}

fun toString(number: Int): String {
    // Note: IntelliJ suggests replacing this with 'when'.
    return if (number == 1) {
        "one"
    } else if (number == 2) {
        "two"
    } else {
        "three"
    }
}
