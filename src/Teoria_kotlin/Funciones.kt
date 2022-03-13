package Teoria_kotlin

import java.lang.StringBuilder

fun main(args: Array<String>) {
    setTitulo("hola Teoria_kotlin.getJavi")
    println(getTitulo("hola campeon"))


    println("BORANDO EL SUFIJO Y PREFIJO que es como *")
    prefSufi()
    println()

    println("LLAMANDO A UNA FUNCION CON PARAMETROSS  ")
    stringBuilder("hola")
    println()

    println("FUNCION IGUALDA A OTRA FUNCION")
    stringBuilderWithStars("Loco")

    val objInfix= Infix()
    objInfix funcinonSinPunto("Imprimiendo sin el punto de la funcion")


}


// funciones seter
fun setTitulo(titulo:String){
    println("*************** $titulo ***************")
}

// funciones geter
fun getTitulo(titulo: String): String{
    var dibujo = "***************"
    dibujo += titulo
    return dibujo
}


/// BORRAR SUFIJOS Y PREFIJOS CON FUNCIIONES SIMPLES
// SIN PARAMETROS DE ENTRADA NI SALIDA
val name = "**javier**"
private fun prefSufi() {
    println("sin tocar, $name")
    name.removePrefix("*").removeSuffix("*").trim()
    println("una vez pasado por la funcion")
    println(name)
}

// FUNCION PARA INSERTAR ADMITE PARAMETROS Y COMO NO LOS PUEDO CAMBIAR IGUALO EL PLARAMETRO
// A UNA VARIABLE QUE SI CAMBIAREE Y DEVOLVERE

private fun stringBuilder(text: String): StringBuilder {
    println(" //// METOD PARA INSERTAR ////////")
    val name = StringBuilder(text)
    println("valor: $text")
    name.insert(0, " ")
    name.insert(name.length, " ")
    println("añado un espacio al name: $text")
    for (i in 0 until 1) {
        name.insert(i, "*")
        name.insert(name.length, "*")
    }
    println("añado las 1 *")
    println(name)
    return name
}


private fun stringBuilderWithStars(text:String):StringBuilder = stringBuilder2Stars(text,4)



private fun stringBuilder2Stars(estrella: String,numerStart: Int): StringBuilder{
    println("INSETAMOS DOS ESTRELLAS")
    val name = StringBuilder("javier")

    for (i in 0 until 3){
        name.insert(i,"*")
        name.insert(name.length,"*")
    }
    println(name)
    return name
}

// FUNCIONES QUE NO NECESITAN UN . PARA SER LLAMADAS
// LA PUEDO LLAMAR EN EL MAIN
class Infix{
    infix fun funcinonSinPunto(name: String){
        println(name)
    }
}







