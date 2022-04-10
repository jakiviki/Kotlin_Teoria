package Teoria_kotlin

fun main(args: Array<String>) {

    // uso del for

    var intArray = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var stringArray = arrayOf("ja","vi","er")

    for (numero in intArray) println(numero) // imprime el valor
    for (i in stringArray) println(i) // imprime el valor
    for (i in 0 .. stringArray.size) println(i) // consigo un indice usando el tamaño
    for (numero: Int in 10..15) println(numero)
    for (numero: Int in 10..15 step 2) println(numero)

    // con until no cuenta el ultimo valor (util para variables desconocidas)
    for (numero: Int in 10 until 15 ) println(numero)

    // para Teoria_kotlin.imprimir en decremento es obligatorio el down
    for (numero: Int in 20 downTo 1 ) println(numero)
    for ((indice,valor) in intArray.withIndex()) println( " En la posicion $indice: $valor")

    // PUEDO GUARDAR EL INDEX Y EL VALUE EN UNA SOLA VARIABLE
    for (a in intArray.withIndex()) println(a)
    for (a in intArray.withIndex()) print(a.index)
    println()
    for (a in intArray.withIndex()) print(a.value)



}
