package languageguide.gettingstarted.idioms

fun main() {
    val map = mapOf("firstName" to "Johnny", "lastName" to "Lim")

    val firstName = map["firstName"] ?: throw IllegalStateException("First name is missing!")
    println(firstName)

    val lastName = map["lastName"] ?: throw IllegalStateException("Last name is missing!")
    println(lastName)

    val age = map["age"] ?: throw IllegalStateException("Age is missing!")
    println(age)
}
