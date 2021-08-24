package problem_8

fun sortUdf(a : ArrayList<Int>): ArrayList<Int>{
    val n = a
    for(i in 0 until a.size){
        for(j in i until a.size){
            if(a[i] > a[j]){
                var temp =  a[i]
                a[i] = a[j]
                a[j] = temp
            }
        }
    }

    return a
}
fun main(){

//    var arr : Array<Int> = arrayOf(3456,8,2,65,8,1,4,7,65, 459,97896)

    var arr : ArrayList<Int> = ArrayList()
    arr.addAll(arrayListOf(3456,8,2,65,8,1,4,7,65, 459,97896))
    println("Original arraylist is : ")
    for(i in arr){
        print("$i ")
    }

    println("\n\nSorting arraylist using inbuilt function:")

    for(i in arr.sorted()){
        print("$i ")
    }


    println("\n\nOriginal arraylist is : ")
    for(i in arr){
        print("$i ")
    }


    println("\n\nSorting arraylist using User Defined Function:")

    for(i in sortUdf(arr)){
        print("$i ")
    }


}