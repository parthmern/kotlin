package OOPS

class Person {
    var name: String = "Default"
        get() {
            println("Getting name")
            return field
        }
        set(value) {
            println("Setting name to $value")
            field = value
        }
}

fun main() {
    val p = Person()
    println(p.name)      // Calls getter
    p.name = "Alice"     // Calls setter
    println(p.name)      // Calls getter again
}
