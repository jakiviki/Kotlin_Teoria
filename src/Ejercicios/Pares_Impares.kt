package Ejercicios

// para saber si es par
// n% 2 == 0
// para saber si es primo de 5, por ejem
// n% 5 == 0

fun main() {

    val numero = listOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    val nPar = mutableListOf<Int>()
    val nImp = mutableListOf<Int>()
    val primo5 = mutableListOf<Int>()
    val division = mutableListOf<Int>()

    // para primos de 5
    for (i in 1 until numero.size){
        if (i % 5 == 0){
            primo5.add(i)
        }
    }

    println("numeros primos de 5: $primo5")


    // pares e impares
    for (i in numero){
        if (i % 2 == 0)
            nPar.add(i)
        else
            nImp.add(i)

    }

    for (i in numero){
        if (i % 4 == 0)
            division.add(i)
    }



    println("numeros pares: $nPar")
    println("tamaño de los pares ${nPar.size}")
    println("numeros impares: $nImp")
    println("tamaño de los Impares ${nImp.size}")
    println("tamaño de division: ${division.size}")
}


