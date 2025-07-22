import java.util.ArrayList as SubList

// interface
interface DkInter<in T> {
    fun display(value: T);
}

interface DkInter2<out T> {
    fun display(): T
}

// type alias
typealias DkSet=HashSet<String>


fun main(){
    val obj : Any = "string";
    // typecasting
    val objj = obj as String;
    println(objj.length)

    // ARRAYLIST
    val list = SubList<String>()

    list.add("2R75NT")
    list.add("thunder")
    list.add("123456")

    println(list)   // [2R75NT, thunder, 123456]
    println(list::class.java.name)  // java.util.ArrayList

    // SET
    val set=DkSet()
    set.add("a")
    set.add("b")
    set.add("c")
    println(set)    // [a, b, c]



}