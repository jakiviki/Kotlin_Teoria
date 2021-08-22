package Ejercicios

// allar el area de un triangulo
// se hace multiplicando la base por la altura

fun main() {
    println(areaTriangulo(10, 25f.toInt()))
    println(getareaTriangulo())
    printareaTriangulo()



}

fun areaTriangulo(base: Int, altura: Int): Int {

    val area = base * altura
    return area
}

fun getareaTriangulo(): Int {
    val base = 100
    val altura = 14
    val area = base * altura
    return area
}

fun printareaTriangulo() {
    val base = 100
    val altura = 14
    val area = base * altura
    println("el area del triangulo en la funcion es $area")
}