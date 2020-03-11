package languageguide.tools

/**
 * A group of *members*.
 *
 * This class has no useful logic; it's just a documentation example.
 *
 * @param T the type of a member in this group.
 * @property name the name of this group.
 * @constructor Creates an empty group.
 */
class Group<T>(val name: String) {
    /**
     * Adds a [member] to this group.
     * @return the new size of the group.
     */
    fun add(member: T): Int = TODO("Not implemented yet! I'm just referencing $member here to suppress a compile warning.")
}

/**
 * A sample function.
 *
 * Use the method [Group.add] for fun.
 *
 * Use [the method][Group.add] for fun.
 *
 * A sample usage is as follows:
 *
 * @sample funB
 *
 * @param firstName first name
 * @param lastName last name
 * @throws IllegalArgumentException if the value is not valid
 * @author Johnny Lim
 * @since 1.0
 */
fun funA(firstName: String, lastName: String) {
    println("In funA(), Hello, $firstName $lastName!")
}

/**
 * Another sample function.
 *
 * @param firstName first name
 * @param lastName last name
 * @exception IllegalArgumentException if the value is not valid
 * @author Johnny Lim
 * @since 1.0
 */
fun funB(firstName: String, lastName: String) {
    println("In funB(), Hello, $firstName $lastName!")
    funA(firstName, lastName)
}

/**
 * Yet another function.
 *
 * @suppress This is only for internal use.
 */
fun funC(firstName: String, lastName: String) {
    println("In funC(), Hello, $firstName $lastName!")
}
