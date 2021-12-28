package Teoria_kotlin

fun main() {


    fun ordenMayor(palabra: String, block: (String) -> Int): Int {
        return block(palabra)
    }
    println("longitud de mi nombre es: ${ordenMayor("javierFernandezGarcia") {  it.length }}")


    // en la puerta declaro e implanto la lambda
    fun sumaLambda(numero: Int, block: (Int) -> Int = {  it + 10 }) {
        println(block(numero))
    }
    sumaLambda(20)


    // solo declaro la lambda en el parametro  luego la implanto
    fun sumaLambda2(numero2: Int, block: (Int) -> Int) {
        println(block(numero2))
    }
    sumaLambda2(44) { it + it }

    // cuidado con el Unit aqui no imprime nada por ser un Unit por eso no pinta nada
    imprimir("cuidado con Unit aqui no devuelve nada y por lo tanto no imprime ningun valor")
    fun imprimelo(palabra: String, block: (String) -> Unit) {
        println(block(palabra))
    }

    imprimelo("Javier") { it.length }  // no devuelve nada al ser unit


    imprimir("lambdas que devuelve lambda pero necesita un String")
    // funciones que devuelven lambdas
    fun lambdasDevuelveLambda(nombre: String): () -> String {
        return { "hola amigo tu nombre es: $nombre" }  // tiene que llevar un string
    }
    println(lambdasDevuelveLambda("el puto amo"))
    var miString = lambdasDevuelveLambda("Pablo")
    println(miString)

    imprimir("lambda que contiene el String")
    val valorLambdas: () -> String = lambdasDevuelveLambda("javier fernandez")
    println(valorLambdas())

}


fun imprimir(name: String) {
    println("************************  $name ******************************")
}