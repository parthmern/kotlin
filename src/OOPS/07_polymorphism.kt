package OOPS

// Polymorphism is an OOP (Object-Oriented Programming) concept where a parent reference can point to child class objects,
// and the correct overridden method is called at runtime.


fun calculateArea(shape: Shape) {
//    calculate area
    shape.findArea()
}

fun main() {
    val shape: Shape = Rectangle()
    calculateArea(shape)
}

open class Shape {
    open fun findArea() {
        println("finding area of shape")
    }

}

class Circle : Shape() {
    override fun findArea() {

        println("Finding area of circle")

    }
}

class Rectangle : Shape() {
    override fun findArea() {
        println("Finding area of rectangle")
    }
}