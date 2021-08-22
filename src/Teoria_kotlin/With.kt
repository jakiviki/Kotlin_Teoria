package Teoria_kotlin

fun main() {
    // esta scot nos permite acceder Teoria_kotlin.a los parametros de la variable

    val nombres = listOf("Teoria_kotlin.getJavi","Noe","irene")

    with(nombres){
        println(this)
        println(size)
    }

    var palabra = "javier fernandez"
    with(palabra){
        println(this)
        println(length)
    }
}