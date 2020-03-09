package languageguide.gettingstarted.idioms

fun main() {
    val value1: Value1 = printType(Value1())
    println("value1 is $value1")
    val value2: Value2 = printType(Value2())
    println("value1 is $value2")

    val reifiedValue1: Value1 = printTypeReified(Value1())
    println("value1 is $reifiedValue1")
    val reifiedValue2: Value2 = printTypeReified(Value2())
    println("value1 is $reifiedValue2")
}

fun <T> printType(value: Any): T {
//    println("$value is " + T::class)
    println("$value is " + value::class.java)
    println("$value is " + value.javaClass)
    @Suppress("UNCHECKED_CAST")
    return value as T
}

inline fun <reified  T> printTypeReified(value: Any): T {
    println("$value is " + T::class)
    println("$value is " + value::class.java)
    println("$value is " + value.javaClass)
    return value as T
}
