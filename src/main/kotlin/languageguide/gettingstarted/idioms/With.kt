package languageguide.gettingstarted.idioms

fun main() {
    val person = WithPerson("Johnny", "Lim")
    println("${person.firstName} ${person.lastName}")
    with(person) {
        println("$firstName $lastName")
    }
}

class WithPerson(val firstName: String, val lastName: String)
