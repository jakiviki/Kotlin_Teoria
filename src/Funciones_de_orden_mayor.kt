fun main() {


    fun ordenMayor(palabra: String, block: (String) -> Int) : Int{
        return block(palabra)
    }
    println(ordenMayor("javi") { it -> it.length })


    // en la puerta declaro e implanto la lambda
    fun sumaLambda(numero: Int,block: (Int) -> Int = {it -> it+10}){
        println( block(numero))
    }
    sumaLambda(20)


    // solo declaro la lambda en el parametro  luego la implanto
    fun sumaLambda2(numero2: Int, block: (Int) -> Int){
        println(block(numero2))
    }
    sumaLambda2(44) { it -> it + it }


    fun imprimelo(palabra: String, block: (String) -> Unit){
        println(block(palabra))
    }
    imprimelo("javi"){it -> println(it)}


    // funciones que devuelven lambdas
    fun lambdas(nombre: String): () -> String{
        return { "hola amigo tu nombre es: $nombre" }  // tiene que llevar un string
    }
    println(lambdas("el puto amo"))



    val valorLambdas: () -> String = lambdas("vamos javi")
    println("ahora siii")
    println(valorLambdas())

}




fun imprimir(name: String){
    println("************************  $name ******************************")
}