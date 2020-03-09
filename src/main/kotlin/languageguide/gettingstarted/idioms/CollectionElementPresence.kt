package languageguide.gettingstarted.idioms

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    if (1 in numbers) {
        println("1 exists in $numbers.")
    }
    if (0 in numbers) {
        println("0 exists in $numbers.")
    }
    if (1 !in numbers) {
        println("1 doesn't exist in $numbers.")
    }
    if (0 !in numbers) {
        println("0 doesn't exist in $numbers.")
    }
}
