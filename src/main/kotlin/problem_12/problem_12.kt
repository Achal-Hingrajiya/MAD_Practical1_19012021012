package problem_12

//Create class of Person & Student.
//Inherit Students from Person and create an array of students and display all the data.


open class  Person(var name : String, var age : Int, var email : String, var phone : String ){

    override fun toString(): String {
        return "Name: $name\t\tAge: $age\t\tEmail: $email\t\tPhone: $phone"
    }

}

class Student (
    var e_no : String,
    var clg_name : String,
    var batch : String,
    var branch : String,
    name : String,
    age : Int,
    email : String,
    phone : String
    ): Person(name, age, email, phone ){

        override fun toString(): String {
            return super.toString() + "\nEn_no: $e_no\t\tBatch: $batch\t\tBranch $branch\t\tCollege Name: $clg_name"
        }
    }

fun main(){

    var ob = Person(
        "Achal",
        20,
        "apcomp1410@gmail.com",
        "6355689874",

    )

    println(ob)

    var ob2 = Student(
        "19012021012",
        "U. V. Patel College Of Engineering",
        "AB4",
        "IT",
        "Achal Hingrajiya",
        20,
        "achalhingrajiya192@gnu.ac.in",
        "6355689874",
    )
    println("\n\n$ob2")
}