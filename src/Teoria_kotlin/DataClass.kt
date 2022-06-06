package Teoria_kotlin
// lo primero que se puede notar a diferencia de una clase es que no hace falta las funciones
// y que los atributos se declaran en el constructor

fun main() {
    // varias formas de llamar al objeto dataclass
    val objetoHumano: Humano = Humano("Blanco","javier","hombre")
    val objetoHumano2: Humano = Humano(nombre = "javier",sexo = "macho",raza = "negro")
    val objetoHumano3 = Humano("blanco",sexo = "mujer",nombre = "susana")


    // una vez crado el objeto la val no se puede cambiar
    // en este caso raza es val y nombre es var

    objetoHumano.nombre = "paco"
    // objetoHumano.raza = "perro"   .error no compilaria

    println(objetoHumano)
    println(objetoHumano2)
    println(objetoHumano3)
}

data class Humano(val raza: String,var nombre: String,var sexo: String)

