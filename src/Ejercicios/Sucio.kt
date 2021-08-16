package Ejercicios

fun main() {
    var array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for ((a, b) in array.withIndex()) println("el indice es: $a y el value: $b")

    // AQUI USO UNA SOLA VARIABLE PARA GUARDAR TODO EL INDEX Y EL VALUE
    for (a in array.withIndex()) println(a)

}