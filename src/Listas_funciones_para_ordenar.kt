fun main() {
    var lista = listOf<Int>(10,20,50,30,90,80)
    println(lista + "simple sin tocar")

    // este metodo ordena de menor a mayor
    val listaMenorMayor = lista.sorted()
    println(listaMenorMayor)

    // ordena de mayor a menor
    val listaMayorMenor = lista.sortedDescending()
    println(listaMayorMenor)

    // ordena por multiplo o por condicion al final de la lista
    val multiplos = lista.sortedBy { numero -> numero < 30 }
    println(multiplos + "multiplos con sortedBy")

    // ordena de forma aleatoria la lista
    val aleatoria = lista.shuffled()
    println(aleatoria+ "aleatoria con shuffled")

    // ordena al contrario
    val reversa = lista.reversed()
    println(reversa + "al contrario con reversed")

    // cambia el valor de las listas con Map
    // en las lamdas solo coge la ultima orden
    // se puede hacer cosas antes tambien.. ejem..
    val mensajes = lista.map { numero ->
        // priemro imprimo
        println("primero imprimo ${numero+1}")
        " El numero es: $numero" }

    println(mensajes)

    // tambien podemos usar un filtrado de la lista
    val filtrados = lista.filter { numero -> numero > 80 }
    println(filtrados)
}