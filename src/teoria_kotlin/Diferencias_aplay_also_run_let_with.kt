package teoria_kotlin

///

fun main() {

    // also y aplay se dirferencian en que also necesita el iterador it
    // las dos devuelven el objeto y podemos acceder a sus metodos

    val javiOb = PersonEjemplo("javi","el mio coño",56)
    val oscarOb = PersonEjemplo("Oscar","el mio coño",56)
    val personaNull: PersonEjemplo? = null

    println("APLAY Y ALSO...")

    javiOb.nombre = "sin apply"
    javiOb.dameNombre()



    javiOb.apply {
        nombre = "Javierillo"
    }.dameNombre()

    javiOb.also {
        it.apellido = "fernandez"
        it.dameNombre()
        println("repito el nombre para comprobar que puedo acceder a los metodos dentro del scot ${it.dameNombre()}")
    }.dameNombre()


    println()
    println("LET...")

    // LA CLAVE ES LA ? SIN ELLA ENTRA EN EL NULL
    // CON ELLA PREGUNTA SI ES NULL Y SI ES TRUE NO ENTRA

    val javi: String? = null

    // AL TENER LA ? PREGUNTA Y SI ES NULL NO ENTRA AL CODIGO
    println( "la variable javi es: $javi  nula y lo demuestro con el elvis")
    javi?.let {
        println("no entra por ser null ")
        println(it)
    }.run { println("ahora  entra en el run") }

    // AL NO TENER ? ENTRA SIN PREGUNTAR Y MANEJA EL NULL
    javi.let {
        println("longitud del javi: " +it?.length)
        println(it)
        print("puedo imprimir todo lo que quiera no solo la ultima linea")
    }

    // PUEDES ITERAR POR EL OBJETO IGUAL QUE ALSO Y APLAY PERO CON EL IT
    println("***** iterando por objeto  Null *****")
    println("sin ? en oscar")
    oscarOb.let {
        it.nombre = " Oscarin"
        println(it.nombre)
    }

    println("con ? en null")
    //NO EJECUTA EL CODIGO AL SER EL OBJ NULO Y USAR LA ?
    personaNull?.let {
        it.nombre = "nombre null"
        println(it.nombre)
    }

    println("sin ? en null")
    //SIN ? ENTRA AL CODIGO Y EJECUTA
    personaNull.let {
        it?.nombre = "AÑADO NOMBRE A UNA PERSONA NULL"
        println(it?.nombre)
    }

    println("----------- HASTA AQUI SON LOS TRES MUY PARECIDO ------------------")


    println()
    println("WITH..")
    // PUEDE ENTRAR EN LAS FUNCIIONES DEL OBJETO y variables
    // puedes devolver algo en la variable

    val personaNueva = with(javiOb){
        println("with  puedes acceder a los metodos")
        nombre.length
        nombre = "Javi el mejor"
        dameNombre()
        nombre
    }
    println("imprimo con un print el objeto nuevo: ${personaNueva}")
    println("imprimo con un print el objeto nuevo: ${personaNueva.hashCode()}")
    println("imprimo con un print el objeto viejo: ${javiOb.hashCode()}")

    // CREADO OBJ DIFERENTES POR ESO IMPRIME DIFERENTES COSAS//////

    with(PersonEjemplo("javi","lslslsl",78)){
        nombre = "javier"
        println("IMPRIMO EL OB CREADO DENTRO DEL WITH")
       dameNombre()
    }
    with(javiOb){
        println("imprimo  con with EL OB CRADO ARRIBA FUERA DEL WITH")
        dameNombre()
    }


    println()
    println("RUN..")
    /// RUN LO QUE METO DENTRO MANEJO EL CONTENIDO , PUEDO METER LOGICA
    //  LO ULTIMO ES UNA DEVOLUCION QUE PUEDO ACCEDER DESPUES DE LA LLAVE

    run {
        println("imprimiendo el metodo pero antes de devolver el objeto que sera el ultimo")
        javiOb
    }.dameNombre()

    println()

    run {
        println("con logica dentro del run")
        if (javiOb.nombre.length > 1) javiOb else oscarOb
    }.dameNombre()

    run {
        oscarOb.nombre = "Oscarin"
        oscarOb
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
