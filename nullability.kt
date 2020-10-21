fun main() {

    var name : String = "Pete"
    //name = null its not allowed

    var a = null //i can say that a variable is null but i cant do anything else like add
    var nullableV : String? = "Maybe I exist"
    //nullableV = null

    //println(nullableV.length)

    //Null check
    var length = 0
    if (nullableV != null) {
        length = nullableV.length
        println(nullableV.length)
    }
    else{
        length = -1
        println(length)
    }

    //or in one line:

    val l = if (nullableV != null) nullableV.length else -1

    //safe call operator
    nullableV = null
    println(nullableV?.length)

    //elvis operator
    val len = nullableV?.length ?: -1
    val newn = nullableV ?: "No one"

    println("$len $newn") // the variable is still null

    //nullableV = null
    // !!
    //println(nullableV!!.length)
    //the last one is for when i am sure that the var is not a null and when it is null the program crushes


}