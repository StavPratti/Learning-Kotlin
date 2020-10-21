fun main() {

    val printMsg = { message: String -> println(message)}//it is a function
    //OR fun testFunction(message: String) {
    //   println(message)

    printMsg("Hi")

    val sumA = { a: Int, b: Int -> a+b}// always in {}
    println(sumA(1,2))

    val sumB : (Int,Int) -> Int = {x,y -> x+y} //another way to write a lambda

    downloadData ("something.com"){
        println("This will run after the completion()")
    }

    downloadCarData("car.com"){car ->
        println(car.color)
        car.accelerate()
    }
    downloadCarData("car.com"){//it implies car, only when we have one parametre
        println(it.color)
        it.accelerate()
    }

    downloadTruckData("truck.com"){truck, success ->
        if(success){
            //we have the truck
            truck?.accelerate()
        }
        else
            println("truck missing")
    }

}
//it is for web requests
fun downloadData(url: String, completion: ()-> Unit){ //unit means void
    //all good
    completion()
}

fun downloadCarData(url: String, completion: (Car) -> Unit){
    //all good
    val car = Car("Tesla", "Models","Red")//class from before
    completion(car)
}

fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit){
    //job done, all good
    val webRequestSuccess = true //if put false all the others are opposite, null
    if (webRequestSuccess){
        //got data
        val truck = Truck("Ford","F-150",1000)
        completion(truck,true)
    }
    else
        completion(null,false)
}
