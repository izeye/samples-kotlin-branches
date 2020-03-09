package languageguide.gettingstarted.idioms

fun main() {
    print(A())
    print(B())
    print(C())
}

private fun print(x: Any) {
    when (x) {
        is A -> println("$x is an instance of A class.")
        is B -> println("$x is an instance of B class.")
        else -> println("$x is not an instance of either A or B class.")
    }
}

class A

class B

class C
