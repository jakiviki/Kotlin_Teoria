package teoria_kotlin

fun main() {

    val lenguages = listOf("java","kotlin","python","c","c++")

    // cambiamos el valor de la lista
    val newLenguages = lenguages.map {
        "Lenguaje de programacion: $it"
    }

    println(lenguages) // sin transformar

    // ya transformado
    newLenguages.forEach {
        println(it)
    }

    // NO NULLOS
    val data = listOf("1","2","+","y","3",null)
    val onlyNumbers = data.mapNotNull {
        // lo paso a enteros y si no hay nulos los guarda en la val
        it?.toIntOrNull()
    }
    onlyNumbers.forEach { println(it) }


}