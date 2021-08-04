fun main() {
    // esta scot nos permite acceder a los parametros de la variable

    val nombres = listOf("javi","Noe","irene")

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