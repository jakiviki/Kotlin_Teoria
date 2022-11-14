package Teoria_kotlin

// PREDICATE SON LAMBDAS QUE DEVUELVEN UN BOOLEAN


fun main() {

    val edades = listOf(12,13,18,16,23,28,45,56)

    val adultos = edades.filter {

        it >= 18

    }

    println("adultos... con filter")
    println(adultos)


    val menores = edades.filterNot {
        it >= 18
    }

    println("menores... con filterNot")
    println(menores)

    println("Filter patition......... ")
    // devuelve dos listas
    val menoresYadultos = edades.partition {
        it >= 18
    }
    println(menoresYadultos)

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
    val dulces = alimentos.take(3).filterNot {
        it !== "avena"
    }

    println("dulces *************")
    println(dulces.joinToString())

    // CUENTA EL CONTENIDO
    println("******* cuento los alimentos *********")
    val nAlimentos = alimentos.count()
    println(nAlimentos)

    println("*********** sumo edades  ***********")
    val edadesMedia = listOf(2,2)
    val sumaAlimentos = edadesMedia.sumOf { it }
    println(sumaAlimentos)

    println("*********** hayando la media de una lista ***********")
    val media = edadesMedia.average()
    println(media)
}
