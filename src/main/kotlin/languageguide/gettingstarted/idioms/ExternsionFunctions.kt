package languageguide.gettingstarted.idioms

fun main() {
    println("Hello, world!".removeSpaces())
}

fun String.removeSpaces(): String {
    return replace(" ", "")
}
