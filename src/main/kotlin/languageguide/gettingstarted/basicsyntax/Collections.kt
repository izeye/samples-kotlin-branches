package languageguide.gettingstarted.basicsyntax

fun main() {
    val items = listOf("banana", "avocado", "apple", "kiwifruit")
    for (item in items) {
        println(item)
    }

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine, too")
    }

    items
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}
