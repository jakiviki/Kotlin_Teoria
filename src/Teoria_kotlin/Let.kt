package Teoria_kotlin


// la funcion let nos permite ejecutar un codigo cuando no es null
// hace falta ? para que actue como un elvis o eso parece
// tambien podemos modificar un objeto sin el elvis
fun main() {

    var nula: String? = null
    nula?.let {
        println(it)
    }

    nula.let {
        println("ENTRANDO CON LET EN UN $it")
    }

    println( nula ?: "Escribiendo a mano por ser null" )


    val personaLet1 = PersonaLet("javi","el mio",45)
    val obNull: PersonaLet? = null

    personaLet1.let {
        it.edad -=3
    }

    obNull.let {
        if (it != null) {
            println("EL VALOR DEL OBJETO ES: ${it.nombre}")
        }

        println(it?.nombre)
    }

    // COMPRUEBO UNA FUNCIN IGUALADA A UN PARAMETRO
    println("IMPRIMIENDO UNA FUNCION IGUALADA EN UNA DATA CLASS")
    println(PersonaLet(apellido = "fernandez").apellido)
}


data class PersonaLet(val nombre:String= "", val apellido:String= "", var edad:Int=0){
    fun dameNombre()= println("nombre: $nombre apellido: $apellido")
    fun dameApellido()= apellido
}