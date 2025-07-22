package OOPS


abstract class Animal {

    abstract val color: String

    //concrete method ( already implemented )
    fun eat() {
        println("Animal is eating")
    }

    //abstract method
    abstract fun speak()
}

abstract class Animal2 {
    abstract val color2: String
}

class Cat : Animal() {
    override val color: String="Black"

    override fun speak() {
        println("Cat is speaking")
    }
}

fun main() {
    val animal: Animal = Cat()
    animal.eat()
    animal.speak()
}

