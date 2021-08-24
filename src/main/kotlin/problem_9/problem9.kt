package problem_9

import java.util.Collections.max
import kotlin.math.max

fun main(){

//    var arr : Array<Int> = arrayOf(6,435,234167,723,6756,225,83,0,400,35,8)

    var arr : ArrayList<Int> = ArrayList()

    arr.addAll(arrayListOf(3456,8,2,65,8,1,4,7,65, 459,97896))

    print("\nOriginal arraylist is:\t")

    for(i in arr){
        print("$i ")
    }

    print("\nMax element form arraylist is: ${arr.maxOrNull()}")
}