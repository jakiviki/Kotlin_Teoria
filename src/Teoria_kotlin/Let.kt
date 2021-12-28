package Teoria_kotlin


// la funcion let nos permite ejecutar un codigo cuando no es null
// hace falta ? para que actue como un elvis o eso parece
// tambien podemos modificar un objeto sin el elvis
fun main() {

    var nula: String? = null
    nula?.let {
        it -> println(it)
    }

    println( nula ?: "no es nula" )

    nula = "Teoria_kotlin.getJavi"
    nula?.let {
        println(it)
    }

    val personaLet1 = PersonaLet("javi","el mio",45)
    personaLet1.let {
        it.edad -=3
    }

    // COMPRUEBO UNA FUNCIN IGUALADA A UN PARAMETRO
    println("IMPRIMIENDO UNA FUNCION IGUALADA EN UNA DATA CLASS")
    println(PersonaLet(apellido = "fernandez").apellido)
}


data class PersonaLet(val nombre:String= "", val apellido:String= "", var edad:Int=0){
    fun dameNombre()= println("nombre: $nombre apellido: $apellido")
    fun dameApellido()= apellido
}