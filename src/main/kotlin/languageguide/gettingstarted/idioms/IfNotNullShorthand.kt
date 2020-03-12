package languageguide.gettingstarted.idioms

fun main() {
    val person1 = Person("Johnny", "Lim")
    val person2: Person? = null;
    println(person1.firstName)
    println(person1.lastName)
    println(person2?.firstName)
    println(person2?.lastName)
    println(person2?.firstName ?: "Unknown")
    println(person2?.lastName ?: "Unknown")
}

data class Person(val firstName: String, val lastName: String)
