package Teoria_kotlin

fun main() {
    var lista = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(lista + "simple sin tocar")

    // este metodo ordena de menor Teoria_kotlin.a mayor
    val listaMenorMayor = lista.sorted()
    println(listaMenorMayor)

    // ordena de mayor Teoria_kotlin.a menor
    val listaMayorMenor = lista.sortedDescending()
    println(listaMayorMenor)

    // ordena por multiplo o por condicion al final de la lista
    val multiplos = lista.sortedBy { numero -> numero < 30 }
    println(multiplos + "multiplos con sortedBy")

    // ordena de forma aleatoria la lista
    val aleatoria = lista.shuffled()
    println(aleatoria + "aleatoria con shuffled")

    // ordena al contrario
    val reversa = lista.reversed()
    println(reversa + "al contrario con reversed")

    // cambia el valor de las listas con Map
    // en las lamdas solo coge la ultima orden
    // se puede hacer cosas antes tambien.. ejem..
    val mensajes = lista.map { numero ->
        // priemro imprimo
        println("primero imprimo $numero")
        " cambio unidades por decenas: ${numero + 10}"

    }

    println("imprimo la val mensages: $mensajes")

    // tambien podemos usar un filtrado de la lista
    val filtrados = lista.filter { numero -> numero > 80 }
    println(filtrados.joinToString())
}