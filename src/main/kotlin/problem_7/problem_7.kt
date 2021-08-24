package problem_7

tailrec  fun fact(n : Int) : Int =
    if (n == 1) 1 else (n * fact(n-1))
fun main(){
    println("Enter number: ")
    var a = readLine()!!.toInt()

    println()

}