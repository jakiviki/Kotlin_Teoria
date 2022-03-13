package Teoria_kotlin

// PREDICATE SON LAMBDAS QUE DEVUELVEN UN BOOLEAN


fun main() {

    val edades = listOf(12,13,18,16,23,28,45,56)

    val adultos = edades.filter {

        it >= 18

    }

    val menores = edades.filterNot {
        it >= 18
    }

    // devuelve dos listas
    val menoresYadultos = edades.partition {
        it >= 18
    }

    val edadesNull = listOf(12,45,null,34,null,11,null)
    val sinNull = edadesNull.filterNotNull()

    println(adultos.joinToString())
    println(menores.joinToString())
    println("********** menores y aduldos **********")
    println(menoresYadultos.first.joinToString())
    println(menoresYadultos.second.joinToString())
    println("********** edades con filterNotNull ************")
    println(sinNull.joinToString())

    // SIEMPRE QUE DEVUELVA UNA LISTA SE PUEDE SEGUIR CONCATENANDO

    val alimentos = listOf("avena","chocolate","huegos","pan")
    val dulces = alimentos.take(2).filterNot {
        it == "nocilla"
    }
    println(dulces.joinToString())

    // CUENTA EL CONTENIDO
    println("******* cuento los alimentos *********")
    val nAlimentos = alimentos.count()
    println(nAlimentos)

    println("*********** sumo edades  ***********")
    val edadesMedia = listOf(12,45,23,89,45,23,12,2,5)
    val sumaAlimentos = edadesMedia.sumOf { it }
    println(sumaAlimentos)

    println("*********** hayando la media de una lista ***********")
    val media = edadesMedia.average()
    println(media)
}
