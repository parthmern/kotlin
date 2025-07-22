// Kotlin functions are the first class which means they can be stored in variables , passed as an argument , returned from another functions .
// inshort, function ko varaible me daal diya

fun main() {
    val square = { x: Int -> x * x }
    val addition = { x: Int, y: Int -> x + y}

    // ( no arg, no return )
    val myVar = {
        println("hi i am lambda")
        println("sum of a and b is ${245 + 25}")
    }

    myVar()     // hi i am lambda   , sum of a and b is 270
    println(square(3))  // 9
    println("Addition using lambda function ${addition(45, 23).toString()}")    // Addition using lambda function 68

}