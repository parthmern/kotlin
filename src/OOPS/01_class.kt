package OOPS

class Car {
    var brand: String = ""
    var model: String = ""
    fun startEngine() {
        println("Engine started! for ${this.model}")
    }
}

fun main(){
    val myCar = Car()
    myCar.brand = "My Car"
    myCar.model = "Camry"
    myCar.startEngine()
}

