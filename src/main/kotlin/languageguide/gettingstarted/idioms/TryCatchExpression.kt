package languageguide.gettingstarted.idioms

fun main() {
    printTps(100, 10)
    printTps(100, 0)
}

fun printTps(transactions: Int, seconds: Int) {
    val tps = try {
        transactions / seconds
    } catch (ex: ArithmeticException) {
        throw IllegalStateException(ex)
    }
    println("TPS: $tps")
}
