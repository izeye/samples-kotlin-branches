package languageguide.gettingstarted.idioms

fun main() {
    val name: String? = "Johnny"
    val mapped = name?.let { it.toLowerCase() } ?: "N/A"
    println("Mapped: $mapped")

    val nullName: String? = null
    val nullMapped = nullName?.let { it.toLowerCase() } ?: "N/A"
    println("Mapped: $nullMapped")

    val nullReturnMapped = name?.let { null } ?: "N/A"
    println("Mapped: $nullReturnMapped")
}
