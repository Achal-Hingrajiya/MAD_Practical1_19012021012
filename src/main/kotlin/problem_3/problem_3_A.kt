package problem_3

fun main() {
    var a : Int = 10
    var b : Int = 20

    println("Before swapping:\na: $a\tb:$b")

    a += b
    b = a - b
    a -= b

    println("\nAfter swapping:\na: $a\tb:$b")
}