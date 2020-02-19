package languageguide.gettingstarted.basicsyntax

fun main() {
    println(maxOf(1, 2))
    println(maxOfWithIfStatementReturn(1, 2))
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    else {
        return b
    }
}

fun maxOfWithIfStatementReturn(a: Int, b: Int) = if (a > b) a else b
