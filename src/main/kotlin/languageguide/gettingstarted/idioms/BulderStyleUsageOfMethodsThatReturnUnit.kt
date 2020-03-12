package languageguide.gettingstarted.idioms

fun main() {
    val array = arrayOfMinusOne(10)
    array.forEach { println(it) }
}

private fun arrayOfMinusOne(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}
