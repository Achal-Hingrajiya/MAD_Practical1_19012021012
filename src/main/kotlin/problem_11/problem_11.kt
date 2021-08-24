package problem_11
//
//Create a class Car and set various members like type,model,price,owner.
//add the function getCarPrice in it.create an array of object of Car class
//and access property of all object.


class Car(var type : String, var model : String, private var price : Double, var owner: String){

    fun getCarPrice() : Double{
        return price
    }

    override fun toString(): String {
        return "Type: $type \tModel: $model\tPrice: $price\tOwner: $owner";
    }



}

fun main(){
    val ob1 = Car("SUV", "2020", 600000.00, "Varun")

    var arr : Array<Car> = arrayOf(
        Car("SUV", "2020", 2000000.00, "Mark") ,
        Car("Sedan", "2019", 1000000.00, "Alex"),
        Car("SUV", "2021", 1200000.00, "Gennady"),
        Car("Hatchback", "2018", 800000.00, "Michael"),
        Car("Sports", "2029", 2000000.00, "Raquel")
    )

    println("Prices of all cars")

    for (a in arr){
        print("${a.getCarPrice()}\t")
    }


    println("\n\nDetails of all cars:\n")

    for (a in arr){
        println(a)
    }

}