package OOPS

//data classes are the class that holds data, In this class some functions are already defined
//
//data class Student(val name: String, val phone: String)
//The compiler automatically derives the following functions :
//
//equals()
//hashCode()
//toString()
//copy()

//Rules
//The primary constructor needs to have at least one parameter.
//All primary constructor parameters need to be marked as val or var.
//Data classes cannot be abstract, open, sealed or inner.
//Data classes may only implement interfaces.



class Test
{
    override fun toString(): String {
        return "this is tostring test"
    }
}

data class Personn(var name: String, var age:Int) {

}

fun main() {
    val person1=Personn("durgesh",26)
    println(person1.age)
    println(person1.name)
    val person1Copy = person1.copy()

    println(person1Copy.age)
    println(person1Copy.name)
    person1Copy.name="Ankit"
    println(person1.name)   // durgesh
    println(person1Copy.name)   // Ankit
    println("----------------")
    println(person1)    // Personn(name=Ankit, age=26)
    println(person1Copy)

    println(Test())

}