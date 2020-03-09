package languageguide.gettingstarted.idioms

fun main() {
    val names = listOf("Johnny", "John")
    val firstPersonName = names.firstOrNull() ?: ""
    println("First person's name: $firstPersonName")

    val ages = listOf<Int>()
    val firstPersonAge = ages.firstOrNull() ?: "N/A"
    println("First person's age: $firstPersonAge")
}
