package Teoria_kotlin

///

fun main() {

    // also y aplay se dirferencian en que also necesita el iterador it
    // las dos devuelven el objeto y podemos acceder a sus metodos

    val personaDiff = PersonEjemplo("javi","el mio coño",56)
    val personaDiff2 = PersonEjemplo("Oscar","el mio coño",56)

    println("APLAY Y ALSO...")

    personaDiff.apply {
        nombre = "Irene"
    }.dameNombre()

    personaDiff.also {
        it.apellido = "fernandez"
    }.dameNombre()

    println()
    println("WITH..")
    // NO PUEDE ENTRAR EN LAS FUNCIIONES DEL OBJETO

    var personaNueva = with(personaDiff){
        println("with no puedes acceder a los metodos")
        nombre.length
        nombre
    }
    println(personaNueva)

    println()
    println("LET...")
    // LET NO LO TENGO MUY CLARO PERO PARA LOS NULOS VA BIEN
    // NO LO IMPRIME POR SER NULO

    var javi: String? = null
    javi?.let {
        println(it)
    }

    // IMPRIME CUANDO NO ES NULO

    javi = "javivi"
    javi?.let {
        println("longitud del javi: " +it.length)
        println(it)
    }

    // PUEDES ITERAR POR EL OBJETO IGUAL QUE ALSO Y APLAY PERO CON EL IT
    personaDiff2.let {
        it.nombre = "Noelita la mejor"
        println("cambio el nombre del objeto con let")
        println(it.nombre)
    }

    println()
    println("RUN..")
    /// RUN LO QUE METO DENTRO MANEJO EL CONTENIDO , PUEDO METER LOGICA

    run {
        println("imprimiendo el metodo pero antes de devolver el objeto que sera el ultimo")
        personaDiff
    }.dameNombre()

    println()

    run {
        println("con logica dentro del run")
        if (personaDiff.nombre.length > 1) personaDiff else personaDiff2
    }.dameNombre()

    run {
        personaDiff2.nombre = "Noe"
        personaDiff2
    }.dameNombre()



}


data class PersonEjemplo(var nombre:String, var apellido:String, var edad:Int=0){
    fun dameNombre()= println("nombre: $nombre apellido: $apellido")
}
