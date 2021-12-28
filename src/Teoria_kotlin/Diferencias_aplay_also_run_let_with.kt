package Teoria_kotlin

///

fun main() {

    // also y aplay se dirferencian en que also necesita el iterador it
    // las dos devuelven el objeto y podemos acceder a sus metodos

    val objPersonaEjem = PersonEjemplo("javi","el mio coño",56)
    val objPersonaEjem2 = PersonEjemplo("Oscar","el mio coño",56)
    val personaNull: PersonEjemplo? = null

    println("APLAY Y ALSO...")

    objPersonaEjem.apply {
        nombre = "Irene"
    }.dameNombre()

    objPersonaEjem.also {
        it.apellido = "fernandez"
        println("repito el nombre para comprobar que puedo acceder a los metodos dentro del scot ${it.dameNombre()}")
    }.dameNombre()


    println()
    println("LET...")
    // LET NO LO TENGO MUY CLARO PERO PARA LOS NULOS VA BIEN
    // NO LO IMPRIME POR SER NULO

    var javi: String? = null
    javi?.let {
        println("no entra por ser null ")
        println(it)
    }

    // IMPRIME CUANDO NO ES NULO

    javi = "javivi"
    javi?.let {
        println("longitud del javi: " +it.length)
        println(it)
    }

    // PUEDES ITERAR POR EL OBJETO IGUAL QUE ALSO Y APLAY PERO CON EL IT
    objPersonaEjem2.let {
        it.nombre = "Noelita la mejor"
        println("cambio el nombre del objeto con let")
        println(it.nombre)
    }

    //CON UN OBJETO NULL no le veo la logica para eso
    personaNull?.let {
        it.nombre = "nombre null"
    }

    println("----------- HASTA AQUI SON LOS TRES MUY PARECIDO ------------------")


    println()
    println("WITH..")
    // PUEDE ENTRAR EN LAS FUNCIIONES DEL OBJETO y variables
    // puedes devolver algo en la variable

    val personaNueva = with(objPersonaEjem){
        println("with  puedes acceder a los metodos")
        nombre.length
        nombre = "Lo he cambiado"
        dameNombre()
        nombre
    }
    println("imprimo con un print: $personaNueva")


    with(objPersonaEjem){
        println("imprimo  con with")
        dameNombre()
    }

    println()
    println("RUN..")
    /// RUN LO QUE METO DENTRO MANEJO EL CONTENIDO , PUEDO METER LOGICA
    //  LO ULTIMO ES UNA DEVOLUCION QUE PUEDO ACCEDER DESPUES DE LA LLAVE

    run {
        println("imprimiendo el metodo pero antes de devolver el objeto que sera el ultimo")
        objPersonaEjem
    }.dameNombre()

    println()

    run {
        println("con logica dentro del run")
        if (objPersonaEjem.nombre.length > 1) objPersonaEjem else objPersonaEjem2
    }.dameNombre()

    run {
        objPersonaEjem2.nombre = "Noe"
        objPersonaEjem2
    }.dameNombre()



}


data class PersonEjemplo(var nombre:String, var apellido:String, var edad:Int=0){
    fun dameNombre()= println("nombre: $nombre apellido: $apellido")
}
