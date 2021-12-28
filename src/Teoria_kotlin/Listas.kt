package Teoria_kotlin

fun main() {
    miPrint("lista con declaracion normal")
    /// listas
    var nombres: List<String> = List(2){"Noelia"}
    println(nombres)

    miPrint("LISTA CON LA DECLARACIÓN DE LA INTERFACE Y FOREACH")
    //con interface
    var apellidos = listOf<String>("fernandez","garcia","elvira","ramona","carmona")
    apellidos.forEach{apellido -> println(" este es el mejor")}

    miPrint("MAP")
    // puede cambiar el valor de la lista
    var valorEntero = apellidos.map { valor -> valor.length }
    println(valorEntero)

    miPrint("FILTER")
    var filtracion = valorEntero.filter { filtrado -> filtrado > 6 }
    println(filtracion)

    miPrint("LISTA INMUTABBLE")
    // solo lectura al no ser mutable
    var lista2= listOf(1,2,3,4,5,6,7,8,9,10)

    miPrint("MUTABLE")
    // lista mutable
    var lista3= mutableListOf(1,2,3,4,5,6,7,8,9,10)
    println(lista3)
    miPrint("remove el 5")
    lista3.remove(5) // borra el valor que le digo
    lista3.add(5)           // añade valor Teoria_kotlin.a la lista
    lista3.removeAt(8) // borra el valor del index
    println(lista3)

    lista3.addAll(lista2) // añade todo el valor de la variable
    println("añadiendo la lista 2 entera: "+lista3)

    println(lista3.get((9))) // get me muestra el contenido
    println("El TAMAÑO DE LA LISTA ES: ${lista3.count()}") // me cuenta los elementos de la lista

    miPrint("intento eliminar los repetido de la lista")
    // elimino los repetidos
    var reptidos = lista3
    println("repetidos: $reptidos")

   



    miPrint("resultado: lista3 = $lista3")
    miPrint("resultado: definitivos = $reptidos")


    miPrint("cambiando el valor de un elemento meto el 11 y luego el 1")
    // cambiar el valor de un elemento los dos son validos
    lista3[0] = 11
    println(lista3.joinToString())
    lista3.set(0,1)
    println(lista3.joinToString())

    // primer y ultimo elemento
    println("Primer elemento: ${lista3.first()}")
    println("Ultimo elemento: ${lista3.last()}")

    // elimina y limpia los elemento
    lista3.clear()
    println(lista3)
    println("tamaño: ${lista3.count()}")



}


fun miPrint(palabra: String){
    println("***** $palabra ***********")
}