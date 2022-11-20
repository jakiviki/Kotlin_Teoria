package Teoria_kotlin

fun main(args: Array<String>) {

    // uso del for

    var intArray = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var stringArray = arrayOf("ja","vi","er")

    println("sin usar el index")
    for (numero in intArray) print(numero) // imprime el valor

    println()
    println("Sin usar el index en una lista de string")
    for (i in stringArray) print(i) // imprime el valor
    println()

    println("Usando rango e index.size")
    for (i in 0 .. stringArray.size) print(i) // consigo un indice usando el tamaño
    println()

    println("Con rango ")
    for (numero: Int in 10..15) print(numero)
    println()

    println("contando de 2 en 2")
    for (numero: Int in 0..15 step 2) print(numero)
    println()


    // con until no cuenta el ultimo valor (util para variables desconocidas) for (numero: Int in 10 until 15 ) print(numero)
    println("bajando de 2 en 2")
    // para Teoria_kotlin.imprimir en decremento es obligatorio el down
    for (numero: Int in 20 downTo 1 ) print(numero)
    println()

    println(" usando WITHiNDEX EN DOS VARIABLES")
    for ((indice,valor) in intArray.withIndex()) println( " En la posicion $indice: $valor")

    println("WITHINDEX EN 1 SOLA VARIABLE")
    // PUEDO GUARDAR EL INDEX Y EL VALUE EN UNA SOLA VARIABLE
    for (a in intArray.withIndex()) println("el valor en una sola variable: $a")
    println()

    for (a in intArray.withIndex()) print(a.index)
    println()

    for (a in intArray.withIndex()) print(a.value)



}
