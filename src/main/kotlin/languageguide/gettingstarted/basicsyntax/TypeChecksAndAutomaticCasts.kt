package languageguide.gettingstarted.basicsyntax

fun main() {
    println(getStringLength("Johnny"))
    println(getStringLength(""))
    println(getStringLength(1))

    println(getStringLengthWithEarlyReturn("Johnny"))
    println(getStringLengthWithEarlyReturn(""))
    println(getStringLengthWithEarlyReturn(1))

    println(getStringLengthWithAndRightHandSide("Johnny"))
    println(getStringLengthWithAndRightHandSide(""))
    println(getStringLengthWithAndRightHandSide(1))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLengthWithEarlyReturn(obj: Any): Int? {
    if (obj !is String) return null
    return obj.length
}

fun getStringLengthWithAndRightHandSide(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}
