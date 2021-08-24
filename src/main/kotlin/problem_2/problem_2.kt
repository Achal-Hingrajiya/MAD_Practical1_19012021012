package problem_2
//
//Type conversion:
//
//Integer to Double, String to Integer, String to Double.

fun main() {
    var i : Int = 10
    var d : Double = (i).toDouble()

    println("Int i: $i\t\t\tDouble d: $d")

    var str : String = "102"
    i = str.toIntOrNull()!!

    println("String str: $str\t\tInt i: $i")

    str = "102.202"
    d = str.toDoubleOrNull()!!

    println("String str: $str\tDouble d: $d")

}