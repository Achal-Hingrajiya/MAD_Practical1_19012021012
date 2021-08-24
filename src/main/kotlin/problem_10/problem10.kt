package problem_10



fun printMatrix(matrix : Array<Array<Int>>) :  String{
    var str = ""
    for (i in 0..2){
        for(j in 0..2){
            str += "${matrix[i][j]}\t"
        }
        str += "\n"
    }

    return  str

}

fun main() {
    val m1 = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))

    val m2 = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))

    println("Matrix1 is :\n${printMatrix(m1)}")


    println("Matrix2 is :\n${printMatrix(m2)}")

    val addAns =  arrayOf(arrayOf(0,0,0), arrayOf(0,0,0),arrayOf(0,0,0))

    for (i in 0..2){
        for(j in 0..2){
            addAns[i][j] = m1[i][j] + m2[i][j]
        }

    }

    println("\nAddition of matrix1 and Matrix2 is: \n${printMatrix(addAns)}")

    val subAns =  arrayOf(arrayOf(0,0,0), arrayOf(0,0,0),arrayOf(0,0,0))

    for (i in 0..2){
        for(j in 0..2){
            subAns[i][j] = m1[i][j] - m2[i][j]
        }

    }

    println("\nSubtraction of matrix2 from Matrix1 is: \n${printMatrix(subAns)}")

}