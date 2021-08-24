package problem_3

fun main() {
    var a = 10
    var b = 15

    println("Before swapping:\na: $a\tb:$b")

    var temp : Int = b
    b = a
    a = temp

    println("\nAfter swapping:\na: $a\tb:$b")
}
