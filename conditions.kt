fun main() {

    val a = 2
    val b = 2

    // == != > < >= <=
    // && ||
    if (a == b){
        println("True")
    }
    else
        println("False")

    val x = 1

    when (x) {
        1 -> println("is one")
        2 -> println("is two")
        else -> println("not one neither two")
    }

    // c || d means c=true||d=true
    //the opposite that means false is: !(c||d)
}
