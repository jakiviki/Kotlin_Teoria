package Teoria_kotlin

///

fun main() {

    // also y aplay se dirferencian en que also necesita el iterador it
    // las dos devuelven el objeto y podemos acceder a sus metodos

    val obPersonJavi = PersonEjemplo("javi","el mio coño",56)
    val obPersonOscar = PersonEjemplo("Oscar","el mio coño",56)
    val personaNull: PersonEjemplo? = null

    println("APLAY Y ALSO...")

    obPersonJavi.apply {
        nombre = "Javierillo"
    }.dameNombre()

    obPersonJavi.also {
        it.apellido = "fernandez"
        println("repito el nombre para comprobar que puedo acceder a los metodos dentro del scot ${it.dameNombre()}")
    }.dameNombre()


    println()
    println("LET...")
    // LET NO LO TENGO MUY CLARO PERO PARA LOS NULOS VA BIEN
    // NO LO IMPRIME POR SER NULO

    var javi: String? = null

    println( "la variable javi es: ${javi ?: "nula y lo demuestro con el elvis"}")
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
    print("************** iterando por objeto no Null **************")
    obPersonOscar.let {
        it.nombre = "Oscar la mejor"
        println("cambio el nombre del objeto con let")
        println(it.nombre)
    }

    //NO EJECUTA EL CODIGO AL SER EL OBJ NULO
    personaNull?.let {
        it.nombre = "nombre null"
    }

    println("----------- HASTA AQUI SON LOS TRES MUY PARECIDO ------------------")


    println()
    println("WITH..")
    // PUEDE ENTRAR EN LAS FUNCIIONES DEL OBJETO y variables
    // puedes devolver algo en la variable

    val personaNueva = with(obPersonJavi){
        println("with  puedes acceder a los metodos")
        nombre.length
        nombre = "Javi el mejor"
        dameNombre()
        nombre
    }
    println("imprimo con un print el objeto nuevo: ${personaNueva.hashCode()}")
    println("imprimo con un print el objeto viejo: ${obPersonJavi.hashCode()}")

    // CREADO OBJ DIFERENTES POR ESO IMPRIME DIFERENTES COSAS//////

    with(PersonEjemplo("javi","lslslsl",78)){
        nombre = "javier"
        println("IMPRIMO EL OB CREADO DENTRO DEL WITH")
       dameNombre()
    }
    with(obPersonJavi){
        println("imprimo  con with EL OB CRADO ARRIBA FUERA DEL WITH")
        dameNombre()
    }


    println()
    println("RUN..")
    /// RUN LO QUE METO DENTRO MANEJO EL CONTENIDO , PUEDO METER LOGICA
    //  LO ULTIMO ES UNA DEVOLUCION QUE PUEDO ACCEDER DESPUES DE LA LLAVE

    run {
        println("imprimiendo el metodo pero antes de devolver el objeto que sera el ultimo")
        obPersonJavi
    }.dameNombre()

    println()

    run {
        println("con logica dentro del run")
        if (obPersonJavi.nombre.length > 1) obPersonJavi else obPersonOscar
    }.dameNombre()

    run {
        obPersonOscar.nombre = "Oscarin"
        obPersonOscar
    }.dameNombre()

    // SE PUEDE CORRER EN UNA VARIABLE
    var nombres = listOf("javi","oscar","miguel","Irene","noelia").run {
        if (this.first() == "javi") "eres el primero de la lista" else " no eres el primero"

        // si comento this lo que devuelvo el lo que esta en el if al ser lo ultimo del cuerpo
        //this
    }

    println(nombres)


}


data class PersonEjemplo(var nombre:String, var apellido:String, var edad:Int=0){
    fun dameNombre()= println("nombre: $nombre apellido: $apellido")
}
