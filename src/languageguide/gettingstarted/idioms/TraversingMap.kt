package languageguide.gettingstarted.idioms

fun main() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((k, v) in map) {
        println("$k -> $v")
    }
}
