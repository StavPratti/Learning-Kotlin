fun main() {
    val arrayL = arrayListOf("I", "am", "Pete")

    val hashmapL = linkedMapOf("Pete" to "tall", "Despo" to "short", "stav" to "shorter")//linked in the beginning in order to be appeared in this order its written

    for (word in arrayL){ //word is initialized in for
        println(word)
    }

    for ((key,value) in hashmapL){
        println(key + value)
    }

    var x = 10;

    while (x > 0) {
        println(x)
        x--
    }

    //var y : Int = 1
    // when (y) {
    //    1 -> println("y == 1")
    //    2 -> println("y == 2")
    //}

    //when() {
    //    "orange" in items -> println("juicy")
    //   "apple" in items -> println("apple is fine too")
    //}
}