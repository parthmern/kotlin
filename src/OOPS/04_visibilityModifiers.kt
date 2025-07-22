package OOPS

/*
Visibility Modifiers in Kotlin:

1. public: Visible everywhere. Default for top-level declarations.
2. private: Visible only within the class or file.
3. internal: Visible within the same module.
4. protected: Visible in the class and its subclasses only.
*/

open class Parent {
    public var publicVar = "I am public"       // Accessible everywhere
    private var privateVar = "I am private"     // Accessible only in Parent
    internal var internalVar = "I am internal"  // Accessible within same module
    protected var protectedVar = "I am protected" // Accessible in subclass

    fun showVars() {
        println(publicVar)
        println(privateVar)
        println(internalVar)
        println(protectedVar)
    }
}

class Child : Parent() {
    fun accessProtected() {
        println(protectedVar) // ✅ allowed
    }
}

fun main() {
    val obj = Parent()
    obj.showVars()

    val child = Child()
    child.accessProtected()

    println(obj.publicVar)     // ✅ public
    // println(obj.privateVar) // ❌ private - not accessible
    println(obj.internalVar)   // ✅ internal
    // println(obj.protectedVar) // ❌ protected - not accessible directly
}
