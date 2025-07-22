package OOPS

//Sealed class is a class which restricts the class hierarchy.
//
//All subclasses of a sealed class must be declared in the same file where sealed class is declared.
//A sealed class is abstract by itself, and you cannot instantiate objects from it.
//You cannot create non-private constructors of a sealed class; their constructors are private by default.
//class Expr
//class Const(val value: Int) : Expr
//class Sum(val left: Expr, val right: Expr) : Expr
//
//fun eval(e: Expr): Int =
//    when (e) {
//        is Const -> e.value
//        is Sum -> eval(e.right) + eval(e.left)
//        else ->
//            throw IllegalArgumentException("Unknown expression")
//    }


sealed class Ball {
}

class GreenBall(val color: String = "Green") : Ball() {
}

class BlueBall(val color: String = "Blue") : Ball() {
}

class RedBall(val color: String = "Red") : Ball() {
}

fun main() {
    val value: Ball = BlueBall("Orange")
    when (value) {
        is RedBall -> println("this is ${value.color} ball")
        is BlueBall -> println("this is ${value.color} ball")
        is GreenBall -> println("this is ${value.color} ball")
    }
}