package languageguide.gettingstarted.idioms

inline fun <reified T: Any> StringConverter.fromString(value: String): T = this.fromString(value, T::class.java)

fun main() {
    val stringConverter = StringConverter()

    val value1: Value1 = stringConverter.fromString("test")
    println(value1.value)
    println(value1::class.java)

    val value2: Value2 = stringConverter.fromString("test")
    println(value2.value)
    println(value2::class.java)
}
