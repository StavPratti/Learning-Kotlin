fun main() {

    val str = "A sentence"
    println(str)

    val str1 = "a sentence \n\"with escaped chars\"."
    println(str1)

    val str2 = """first line
        |second line
        |third line
    """.trimMargin()

    println(str2)

    for (char in str) {
        //for each letter in the sentence
        //char is initialize inside the loop for
        println(char)
    }

    println(str.contentEquals(str1))

    println(str1.contains(str,true)) //true means does not matter if the letters are capital

    println(str.toUpperCase())

    val num = 6
    println(num.toString())

    println(str.subSequence(0,5)) //the first 5 characters are appeared on the screen

    val name = "Stav"
    val lname = "Pratti"

    println(name +" ${lname.toUpperCase()} $num is not the number of letters ${lname.length}")
    // i can write it inside println without initializing a new variable

}
