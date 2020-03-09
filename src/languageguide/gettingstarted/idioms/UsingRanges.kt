package languageguide.gettingstarted.idioms

fun main() {
    for (i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 2..10 step 2) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    if (1 in 1..10) {
        println("1 is between 1 and 10.")
    }
    if (1 !in 1..10) {
        println("1 is not between 1 and 10.")
    }
    if (0 in 1..10) {
        println("0 is between 1 and 10.")
    }
    if (0 !in 1..10) {
        println("0 is not between 1 and 10.")
    }
}
