package languageguide.gettingstarted.idioms

fun main() {
    var a = 1
    var b = 2
    a = b.also { b = a }
    println("a is $a.")
    println("b is $b.")
}
