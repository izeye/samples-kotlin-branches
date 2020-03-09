package languageguide.gettingstarted.idioms

fun main() {
    var name: String? = "Johnny";
    name?.let {
        // Trigger KotlinNullPointerException
//        name = null
        name = name!!.toLowerCase()
    }
    println("Name: $name")

    var nullName: String? = null;
    nullName?.let {
        nullName = nullName!!.toLowerCase()
    }
    println("Name: $nullName")
}
