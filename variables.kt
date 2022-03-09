fun main() {
    var name = "Stav" // var can change its value
    val isBoolean = true // val with l is stable always

    println("Is " + name + " my name? That's: " + isBoolean)
    // in println use $ when you want to add a variable in between only one""
    // that means: or println(" Is $name my name? Thats: $isBoolean")

    var a = 3
    var b: Int = 9 // in kotlin you dont have to say whether the variable is int or string, so : Int can be omitted
    //val c: Int
    //c = 6
    println(a+b)

    var d = 123.22
    var f = 123.23f // in float numbers i have to put the letter f next to it


    println(d+f+a)

    var l = 99999999999999L // in long numbers i have to put the letter L next to it

    var bd = b.toDouble() // bd is always a new name of variable but before .toDouble() is always an already existing variable
    // .toString() .toInt() etc

    var astr = '3'
    var bstr = '9'
    println(astr+name)

    val name: String? = null // i put questionmark at the end of the type if i want to assign the null price to a var/val
}
