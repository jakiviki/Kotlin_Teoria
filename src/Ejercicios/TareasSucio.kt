package Ejercicios

import Humano

fun main() {
    var javi:Persona = Persona("javi",null)

    var listadoPersonas = mutableListOf<Persona>()
    listadoPersonas.add(javi)
    listadoPersonas.add(Persona("Luis","fernandito"))
    listadoPersonas.add(Persona("carmen","jovencita"))
    listadoPersonas.add(Persona("Desconocido","el puto amo"))

    println("******** imprimiendo el nombre con un for **************")
    listadoPersonas.forEach{it -> println(it.nombre)}


    println("******** imprimiendo el coche **************")

    var miCoche: Coche = Coche("wolsvagen",20000,"Polo")
    println(miCoche.marca)
    println(miCoche.precio)
    println(miCoche.modelo)
    // pregunto por el bonus aplicado
    println("el bonus de este modelo es: ${miCoche.bonus}")





}


