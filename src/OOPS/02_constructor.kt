package OOPS

//Constructors
//Constructors are like member functions that are called when object of the class is created , they initilize the data members for objects
//
//Primary Construtors
//The primary constructor is initialized in the class header

//class Add constructor(val a: Int, val b: Int) {
//    // code
//}
// ---------------------------
//Primary Constructor with Initializer Block
class Demo constructor(var x: Int, var y: Int) {
    init {
        println("This is init block")
    }
}
// ----------------------------
//Default values
//class Demo constructor(var x: Int=70, var y: Int=90) {
//    init {
//        println("This is init block x: $x , y:$y")
//    }
//}

//========================================
//Secondary Constructor
//Kotlin may have one or more secondary constructors. Secondary constructors allow initialization of variables and allow to provide some logic to the class as well. They are prefixed with the constructor keyword.
// class with one secondary constructor
class Add
{
    constructor(a: Int, b:Int)
    {
        var c = a + b
        println("The sum of numbers 5 and 6 is: ${c}")
    }
}

// Kotlin program of two secondary constructors in a class:

class employee {
    constructor (emp_id : Int, emp_name: String ) {
        var id: Int = emp_id
        var name: String = emp_name
        print("Employee id is: $id, ")
        println("Employee name: $name")
        println()
    }

    constructor (emp_id : Int, emp_name: String ,emp_salary : Double) {
        var id: Int = emp_id
        var name: String = emp_name
        var salary : Double = emp_salary
        print("Employee id is: $id, ")
        print("Employee name: $name, ")
        println("Employee name: $salary")
    }
}