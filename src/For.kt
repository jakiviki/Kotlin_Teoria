fun main(args: Array<String>) {

    // uso del for

    var array1 = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for (numero in array1) println(numero)
    for (numero: Int in 10..15) println(numero)
    for (numero: Int in 10..15 step 2) println(numero)
    // con until no cuenta el ultimo valor (util para variables desconocidas)
    for (numero: Int in 10 until 15 ) println(numero)
    // para imprimir en decremento es obligatorio el down
    for (numero: Int in 20 downTo 1 ) println(numero)

    for ((indice,valor) in array1.withIndex()) println( " En la posicion $indice: $valor")
}