fun main() {

    testFunction()

    val par = "blah"
    testFunctionArgs(par)

    println("sum is ${calculateFunction(4,1)}")

    printFunction("this is string that overrides")
}

fun testFunction(){
    println("inside test function")
}

fun testFunctionArgs(line: String){ //inside the functions i have to write the type of the variables
    println(line)
}

fun calculateFunction(a: Int, b: Int): String{ // i have to write the type of the variable this function returns
    return (a + b).toString()
}

fun printFunction(str: String = "this is a string"){
    println(str)
}    
    
fun sayHello(): Unit{ // Unit doesnt return anything, can be omitted
 println(calculateFunction())   
}

// i  can write String? for null values

