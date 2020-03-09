package languageguide.gettingstarted.idioms

fun main() {
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])
    map["a"] = 10
    println(map)
}
