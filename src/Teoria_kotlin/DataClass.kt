package Teoria_kotlin// lo primero que se puede notar Teoria_kotlin.a diferencia de una clase es que no hace falta las funciones
// y que los atributos se declaran en el constructor

fun main() {
    // varias formas de llamar al objeto dataclass
    var objetoHumano: Humano = Humano("Blanco","javier","hombre")
    var objetoHumano2: Humano = Humano(nombre = "javier",sexo = "macho",raza = "negro")
    var objetoHumano3 = Humano("blanco",sexo = "mujer",nombre = "susana")

    println(objetoHumano)
    println(objetoHumano2)
    println(objetoHumano3)
}

data class Humano(val raza: String,var nombre: String,var sexo: String)