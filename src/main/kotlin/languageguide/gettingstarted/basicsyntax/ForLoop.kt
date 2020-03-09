package languageguide.gettingstarted.basicsyntax

fun main() {
    testForLoop()
    testForLoopWithIndex()
}

fun testForLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun testForLoopWithIndex() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}
