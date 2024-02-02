package teoria_kotlin

import Ejercicios.Persona


// clase Objeto no hace falta crear un objeto para acceder a sus atributos
// y tampoco el apodo de class en la declaracion
object Perro {
    var raza: String = ""
    var nombre: String = ""
}

object Person {
    var name = ""
    var edad = 0
     operator fun invoke(name: String, edad: Int){
        this.name = name
        this.edad = edad
    }
}




fun main() {

    println("CREANDO EL OBJETO BICI************************")



    // llamamos al objeto abstracto es como si ya estuviera echo el objeto
    println("has del perro: $Perro")
    Perro.nombre = "miko"
    Perro.raza = "humano"
    println(Perro.nombre)
    println(Perro.raza)
    println("intento de obj del perro")
    val objpersona = Person("javi",34)
    val objpersona2 = Person("rosa",34)
    println("persona has: ${objpersona.hashCode()}")
    println("persona has: ${objpersona2.hashCode()}")
    println("objeto declaration: ${Persona().hashCode()}")
    println(Person.name)





}