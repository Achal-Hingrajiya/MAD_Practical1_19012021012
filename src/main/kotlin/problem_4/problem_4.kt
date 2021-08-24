package problem_4

fun main() {

    println("Enter a number to check even or odd: ")
    var a : Int = readLine()?.toInt()!!

    if(a % 2 == 0){
        println("$a is an even number.")
    }
    else{
        println("$a is an odd number")
    }
}