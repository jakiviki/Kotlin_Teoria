fun main() {
    // existen dos tipos de mapas: mutables y no mutables

    val superheroes = mapOf("Iroman" to 100, "Hulk" to 200, "mujer maravilla" to 300)
    println(superheroes)

    // mutables
    var superHeroesMutables = mutableMapOf("Capi" to 90, "avispa" to 80)
    println(superHeroesMutables)

    // varias formas para añadir
    superHeroesMutables.put("spiderman",200)
    superHeroesMutables["Pantera"] = 100

    println(superHeroesMutables)

    // para obtener un valor
    val powerCapi = superHeroesMutables["Capi"] // las mayusculas afectan
    println(powerCapi)

    // para borrar valores
    superHeroesMutables.remove("avispa")

    // para ver las claves y los valores
    println(superHeroesMutables.keys)
    println(superHeroesMutables.values)

    for (i in superHeroesMutables.keys) {
        println("muestra las llaves"+i)
    }

    // se puede capturar el elemnto por separado tambien dentro del for
    for (i in superHeroesMutables) {
        println("valor y clave: "+i)
        println("Key: ${i.key}")
        println("valor: ${i.value}")
        println("++++++++++++++++++++++++++++++")
    }

    if ("Iroman" in superheroes) println("Existe") else println("No existe")
    if ("Iroman" in superheroes.keys) println("Existe") else println("No existe")
    if (100 in superheroes.values) println("Existe") else println("power: 100")
   // if (100 in superheroes)  println("power: 100")


}