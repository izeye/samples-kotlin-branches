package languageguide.gettingstarted.idioms

fun main() {
    val person = ApplyPerson("Johnny", "Lim").apply { age = 20 }
    println("${person.firstName} ${person.lastName} is ${person.age} years old.")
}

class ApplyPerson (val firstName: String, val lastName: String) {
    var age: Int? = null
}
