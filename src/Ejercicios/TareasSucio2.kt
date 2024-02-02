package Ejercicios

import sun.text.normalizer.UCharacter.getAge
fun main(){
    val ejem = "susana fernandez"
    ejem.split("").map { it.first().uppercase() }.joinToString(separator = ".", prefix = "*", postfix = "*")
    println(ejem)
    println(
        name("javier fernandez")

    )
}


fun name(name: String): String {
    val newName =  name
        .split(" ")
        .map { it.first().uppercase() }
        .joinToString(separator = ".")

    return newName
}