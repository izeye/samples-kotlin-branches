package languageguide.gettingstarted.basicsyntax

fun main() {
    var a = 1
    val s1 = "a is $a"
    println(s1)

    a = 2
    println(s1)
    val s2 = "${s1.replace("is", "was")}, but now is ${a}"
    println(s2)
}
