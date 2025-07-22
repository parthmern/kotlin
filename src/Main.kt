fun main(){
    println("hello world")
    println("hii");

    var name = "parth"
    val userid = 1

    println("name is" + name)
    println("userid is $userid")

    val a = 1
    val b = 2
    println("sum is ${a+b}")

    // a = 2;   // VAL cannot be chage like const
}

// COMPILE :  kotlinc filename.kt -include-runtime -d run.jar
// RUN : java -jar run.jar