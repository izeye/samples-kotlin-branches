package languageguide.gettingstarted.idioms

fun greet(name: String = "World") {
    println("Hello, $name")
}

fun main() {
    greet()
    greet("Johnny")
}
