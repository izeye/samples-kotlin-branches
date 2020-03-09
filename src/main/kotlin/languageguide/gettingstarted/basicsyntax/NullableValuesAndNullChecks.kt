package languageguide.gettingstarted.basicsyntax

fun main() {
    println(parseInt("1"))
    println(parseInt("a"))

    printProduct("1", "2")
    printProductWithEarlyReturn("1", "2")

    printProduct("1", "a")
    printProductWithEarlyReturn("1", "a")
}

fun parseInt(str: String): Int? {
    return try {
        str.toInt()
    }
    catch (ex: NumberFormatException) {
        return null;
    }
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun printProductWithEarlyReturn(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }

    if (y == null) {
        println("Wrong number format in arg1: '$arg2'")
        return
    }

    println(x * y)
}