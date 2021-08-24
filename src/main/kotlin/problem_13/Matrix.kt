package problem_13

class Matrix (private var matrix : Array<Array<Int>>){

    override fun toString(): String {

        var strMatrix = ""
        for (i in 0..2){
            for(j in 0..2){
                strMatrix += "${matrix[i][j]}\t"
            }
            strMatrix += "\n"
        }
        return strMatrix
    }

    operator fun plus( matrix2 : Matrix) : Matrix{
        val ans =  Matrix(arrayOf(arrayOf(0,0,0), arrayOf(0,0,0),arrayOf(0,0,0)))

        for (i in 0..2){
            for(j in 0..2){
                ans.matrix[i][j] = this.matrix[i][j] + matrix2.matrix[i][j]
            }

        }

        return ans

    }

    operator fun times( matrix2 : Matrix) : Matrix{
        val ans =  Matrix(arrayOf(arrayOf(0,0,0), arrayOf(0,0,0),arrayOf(0,0,0)))

        for (i in 0..2){
            for(j in 0..2){
                for (k in 0..2){
                    ans.matrix[i][j] += this.matrix[i][k] * matrix2.matrix[k][j]
                }
            }
        }


        return ans

    }

    operator fun minus( matrix2 : Matrix) : Matrix{
        val ans =  Matrix(arrayOf(arrayOf(0,0,0), arrayOf(0,0,0),arrayOf(0,0,0)))

        for (i in 0..2){
            for(j in 0..2){
                ans.matrix[i][j] = this.matrix[i][j] - matrix2.matrix[i][j]
            }

        }

        return ans

    }

}

fun  main() {
    val o1 = Matrix(
        arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    )

    val o2 = Matrix(
        arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    )

    println("Matrix1 is :\n$o1")
    println("Matrix2 is :\n$o2")

    println("\nAddition of matrix1 and Matrix2 is: \n${o1 + o2}")
    println("\nSubtraction of matrix2 from Matrix1 is: \n${o1 - o2}")
    println("\nMultiplication of matrix1 and Matrix2 is: \n${o1 * o2}")
}