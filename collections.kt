fun main() {

    val tableList = listOf("Alpha", "Delta", "Beta", "Gamma")

    //val items = listOf("apple", "banana", "kiwifruit")
    //for (index in items.indices) {
    //    println("item at $index is ${items[index]}")
    println(tableList) // is appeared in []
    println(tableList.sorted()) // in an alphabetic way
    println(tableList[3] + tableList.last()) //the first item is in 0 position
    //also .first()

    val arrayL = arrayListOf("I", "am", "Stav") //array in the beginning because i can change it, it is mutable in oppose with the previous one
    println(arrayL.size) //the number of the items
    arrayL.add("Pratti") //last one
    println(arrayL)
    arrayL.add(2, "the")//we choose the position to add it
    println(arrayL)
    println(arrayL.indexOf("Stav")) //in which position is it?
    arrayL.remove("am")
    println(arrayL)
    println(arrayL.contains("am")) //its false

    val mapL = mapOf("Pete" to "male", "Despo" to "female") //"keys" to "values"
    println(mapL["Pete"])
    println(mapL.get("Despo")) //the same as the previous
    println(mapL.getOrDefault("stav","don't assume")) //stav doesnt exist
    println(mapL.keys)
    println(mapL.values)

    val hashmapL = hashMapOf("Pete" to "tall", "Despo" to "short")// it is a mutable map that is for hash in the beginning
    hashmapL["Despo"] = "kinda tall" //we change the value of the key
    hashmapL.put("stav","short") //add a new key and a value
    println(hashmapL)
    hashmapL.remove("Despo")//and its value is also removed
    hashmapL.clear() //also .isEmpty() that is true or false

}