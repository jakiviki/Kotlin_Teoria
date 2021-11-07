package Teoria_kotlin

// esta scot nos permite acceder a los parametros de la variable
// la diferencia con run es que run seria mas para un logica, creo

fun main() {
    println("imprimo una listOf")
    val nombres = listOf("Teoria_kotlin.getJavi", "Noe", "irene")

    with(nombres) {
        println(this)
        println(size)
        println(nombres[1])
    }

    println("imprimo una palabra dentro del with")
    var palabra = "javier fernandez"
    with(palabra) {
        println(this)
        println(length)
    }

    val personaWith1 = personaRun("javi", "del olmo", 19)
    val personaWith2 = personaRun("javi", "del olmo", 45)

    println("Usando el with con un objeto")
    with(personaWith1) {
        println(this.nombre) // usando el this
        println(nombre)  // sin usar el this
        nombre    // al ser el ultimo es una devolucion y podemos usar los metodos con un .
    }

    println(" guardando en una variable la devolucion del objeto persona1 y cambio el nombre")
    val devolucion = with(personaWith1) {

        nombre.let {
            println("imprimo el it: $it")
            println(it.length)
        }
        // devuelvo algo para gurardar en la variable devolucion
        nombre
    }

    // imprimo la devolucion
    print("la devolucion: es $devolucion")

}


data class PersonaWith(var nombre: String, val apellido: String, var edad: Int = 0) {
    fun dameNombre() = println("nombre: $nombre apellido: $apellido")
}
