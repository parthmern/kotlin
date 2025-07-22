package OOPS

//In Kotlin, an interface is a collection of abstract methods and properties that define a common contract for classes that implement the interface.
//An interface is similar to an abstract class, but it can be implemented by multiple classes, and it cannot have state.

// same as abstract class ( but abstract class you are not able to inherit more than one )

interface MyInter {

    val x: Int
    fun test()

}

interface Cloneable {
    fun clone()
}

class MyInterImpl : MyInter, Cloneable {
    override val x: Int=30

    override fun test() {
        println("this is overriding testing methods")
    }

    override fun clone() {
        println("Cloning child1")
    }
}
