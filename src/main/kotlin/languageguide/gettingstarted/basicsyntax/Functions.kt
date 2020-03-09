package languageguide.gettingstarted.basicsyntax

fun main() {
    println(sum(1, 2))
    println(sumWithoutReturnType(1, 2))
    println(printSum(1, 2))
    println(printSumWithoutReturnType(1, 2))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumWithoutReturnType(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

fun printSumWithoutReturnType(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}
