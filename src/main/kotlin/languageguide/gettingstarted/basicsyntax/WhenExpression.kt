package languageguide.gettingstarted.basicsyntax

fun main() {
    println(describe(1))
    println(describe(2))
    println(describe("Hello"))
    println(describe("World"))
    println(describe(1L))
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }
