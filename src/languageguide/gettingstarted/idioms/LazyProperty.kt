package languageguide.gettingstarted.idioms

fun main() {
    val message: String by lazy {
        println("Initialing...")
        "Hello, world!"
    }
    println("Before accessing message.")
    println(message)
}
