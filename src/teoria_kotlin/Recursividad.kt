package teoria_kotlin

// FUNCIONES QUE SE LLAMAN ASI MISMAS
// SE PRECFIEREN ANTES QUE UN FOR EXCEPTO CUANDO EL DATO ES MUY GRANDE
// IMPORTANTE TENER UN LIMITE BASE

fun main() {

    val precios = doubleArrayOf(1.0,2.0,3.0,4.0)
    // EJECUTO LA FUNCION RECURSIVA
    println(sumaPrecios(precios,precios.size -1))

    val numeros: IntArray = IntArray(100)
    (0 until 100).forEach{
        numeros[it] = it+1
    }


}


fun sumaPrecios(precios: DoubleArray, limitIndex: Int): Double{

    // caso limit base
    if (limitIndex == 0) return precios[0]

    // recursividad 0hhhhh!
    // esto va poniendo en una pila el primer resultado mas el del la funcion
    // cuando el limit llege a 0 devuelve el otro if
    val resul = precios[limitIndex] + sumaPrecios(precios,limitIndex -1)
    return resul
}

