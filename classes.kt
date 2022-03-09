open class Vehicle(val make: String, val model: String){ //open is for the mother class
// before the name of the variable i have to write whether it is a var or val always
    open fun accelerate(){ //open because i can change this particular function in another class just by using the world override
        println("$model go faster")
    }

    fun brake(){
        println("$make go slower")
    }
    
    constructor(): this("Peter", "Parker"){
        println("secondary constructor")
    }
    
    init {  // this part of code always runs
        println("init 1")
    }   
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model){
    //after these : i have to write the mother class and the name and type of the parametres, which are always the same as the class that inherits
    override fun accelerate(){
        println("$model go even faster")
        super.accelerate() // super. means that i call the authentic function of the mother, not changed
    }
}

class Truck(make: String, model: String, var weight: Int): Vehicle(make, model) //before the new variable i have to write var or val

//class Car (val make: String, val model: String){
//
//    fun accelerate(){
//        println("faster")
//    }
//
//}
//
//class Truck (val make: String, val model: String, val weight: Int){
//
//    fun tow(){
//        println("heavy")
//    }
//}

fun main(){

//    val car = Car("Honda","Jazz")
//    println(car.make +" "+car.model)
//    car.accelerate()
//
//    val truck = Truck("Ford","F-150",10000)
//    truck.tow()

    val tesla = Car("Tesla","Models","Red")
    tesla.accelerate() //or car.accelerate()
    //in main i can only call a function, not the whole class
    //in main i call the class just to give names in parametres
    val truck = Truck("Ford","F-150",10000)
    truck.accelerate()

}
