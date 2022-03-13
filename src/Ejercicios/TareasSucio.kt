package Ejercicios

fun main() {

    val objPersonas: MutableList<Person> = mutableListOf()

    objPersonas.add(Person("javi","ferna",5))
    println(objPersonas[0].dameDatos())
    println(objPersonas[0].dameEdad())

    val numerRandom = (2 * Math.random()).toInt()
    println(
        "IMPRIMO UN RANDOM $numerRandom"
    )


}


class Person(  var nombre: String,  val apellido: String, private var edad: Int ) {

    init {
        println( " me llega la edad de $edad")
        if (edad < 18) edad = 18 else edad = edad
    }


    fun dameNombre(): String{
        println(nombre)
        return this.nombre

    }

    fun dameEdad(){
        println(edad)

    }

    fun dameDatos(){
        println("Nombre: $nombre, Apellido: $apellido, Edad: $edad,////////// ")
    }

}



