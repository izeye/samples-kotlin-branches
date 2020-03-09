package languageguide.gettingstarted.idioms

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.filter { x -> x > 3 })
    println(numbers.filter { it > 3 })
}
