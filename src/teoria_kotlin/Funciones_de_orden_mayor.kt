package teoria_kotlin


fun main() {


    fun validate(x: Int, isTrue:(x:Int)-> Boolean): Boolean = isTrue(x)

    println("imprimo si es mayor o menor ")
    val istrue = validate(12){ it < 20 }
    println(istrue)

    // DEVUELVE UN INT NO LA LAMBDA.  (//////////////
    fun ordenMayor(palabra: String, block: (String) -> Int): Int {
        return block(palabra)
    }

    // solo imprimira el numero que es la devolucion //////////////////
    println("longitud de mi nombre es: ${ordenMayor("javier") {  it.length }}")


    // en la FIRMA declaro e implanto la lambda
    fun sumaLambda(numero: Int, block: (Int) -> Int = {  it + 10 }) {
        println(block(numero))
    }
    sumaLambda(20)

    fun restar(numero: Int, numerodos: Int, block: (Int,Int)-> Int): Int{
        return block(numero,numerodos)
    }
    println("restar")
    println(restar(12,6){a,b-> a-b})


    // solo declaro la lambda en el parametro  luego la implanto  //////////////////////////////////////////
    imprimir("uso el parametro dentro de la funcion")
    fun sumaLambda2(numero2: Int, block: (Int) -> Int) {
        println(block(numero2))
    }
    sumaLambda2(44) { it + it }
    sumaLambda2(44) { it - it }

    // cuidado con el Unit aqui no imprime nada por ser un Unit por eso no pinta nada  /////////////////////////
    imprimir("cuidado con Unit aqui no devuelve nada y por lo tanto no imprime ningun valor")
    fun imprimelo(palabra: String, block: (String) -> Unit) {
        println(block(palabra))
    }

    // no devuelve nada al ser unit
    imprimelo("Javier") { it.length }
    // tedria que hacerlo dentro del cuerpo de la lambda
    imprimelo("supercalofrio"){ println(it.length)}


    imprimir("lambdas que devuelve lambda pero necesita un String")
    // funciones que devuelven lambdas
    fun lambdasDevuelveLambda(nombre: String): () -> String {
        return { "hola amigo tu nombre es: $nombre" }  // tiene que llevar un string
    }

    // al devolver una lambda tengo que ejecutarla con el () para imprimirla /////////////
    var miString = lambdasDevuelveLambda("Pablo")
    println(miString())

    imprimir("lambda que contiene el String")
    val valorLambdas: () -> String = lambdasDevuelveLambda("javier fernandez")
    println(valorLambdas())


    // ADMITE Y DEVUELVE UNA LAMBDA CONJUGADAS LAS DOS    /////////////////////////
    imprimir("USAMOS DOS LAMBDAS A LA VEZ UNA ADMITE Y OTRA DEVUELVE LAMBDAS")

    fun getId(context: (valor: String)-> Unit){
        // api, base de room, datos
        val api = "1234"
        context(api)
    }

    fun setearId(): (valor: String)-> Unit{
        return {
            println("El id del producto es: $it")
        }

    }

    // AL EJECUTARA: ESTA LAMBDA ADMITE Y LA INYECTADA IMPRIME
    getId(setearId())

}


fun imprimir(name: String) {
    println("--********  $name ******************************")
}