package languageguide.gettingstarted.idioms

data class TestDataClass(val firstName: String, val lastName: String)

class TestClass(val firstName: String, val lastName: String)

fun main() {
    val testDataClass = TestDataClass("Johnny", "Lim")
    println(testDataClass)
    println("${testDataClass.firstName} ${testDataClass.lastName}")
    val testClass = TestClass("Johnny", "Lim")
    println(testClass)
    println("${testDataClass.firstName} ${testDataClass.lastName}")
}
