package teoria_kotlin

import kotlin.random.Random

fun main() {
    // crear un bucle while que se rompa con un Teoria_kotlin.getNumero indeterminado

    while (true){
        var ramdom = Random(System.nanoTime()).nextInt(1,10)
        println("El Teoria_kotlin.getNumero es: $ramdom")

        if (ramdom == 5){
            println("Enorabuhena has acertado el Teoria_kotlin.getNumero es: $ramdom")
            break
        }
    }

        println("**************")
    do {
        var ramdom = Random(System.nanoTime()).nextInt(1,10)
        println("El Teoria_kotlin.getNumero en do while es: $ramdom")

        if (ramdom == 5){
            println("Enorabuhena has acertado el Teoria_kotlin.getNumero es: $ramdom")
            break
        }
    }while (true)
}