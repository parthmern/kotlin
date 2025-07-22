package OOPS

//By default, all classes and their members in Kotlin are final — meaning they cannot be inherited or overridden.
//To allow a class or a function to be inherited or overridden, you need to mark it with the open keyword.

open class Samosa {
    var x = 40
    fun displayX() {
        println("X=$x")
    }
}

open class MeethaSamosa : Samosa() {
    var y = 50
    fun displayY() {
        println("Y = $y")
    }
}


class BekarSamosa : MeethaSamosa() {
    var bekarProp = "main to child hoon meethasamosa ka"

}

fun main() {

    val meethaSamosa = MeethaSamosa()
    meethaSamosa.displayX()
    meethaSamosa.displayY()

    val bekarSamosa = BekarSamosa()
    println(bekarSamosa.bekarProp)
    bekarSamosa.displayX()
    bekarSamosa.displayY()

}

// All properteis and methods are inherited we can use on child class obejcts