package problem_6

fun subtraction(a:Float, b:Float): Float {
    return a - b ;
}

fun addition(a:Float, b:Float): Float {
    return a + b ;
}
fun multiplication(a:Float, b:Float): Float {
    return a * b ;
}
fun division(a:Float, b:Float): Float {
    return a / b ;
}

fun main(){
    println("Enter number1: ")
    var a = readLine()!!.toFloat()

    println("Enter number2: ")
    var b = readLine()!!.toFloat()

    println("$a + $b = ${addition(a, b)}")
    println("$a - $b = ${subtraction(a, b)}")
    println("$a * $b = ${multiplication(a, b)}")
    println("$a / $b = ${division(a, b)}")


}