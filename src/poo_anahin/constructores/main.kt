package poo_anahin.constructores

import javafx.geometry.Pos
import java.time.LocalDateTime
import java.time.Month
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities

fun main (){

    val obPost = Post(
        title = "el valiente",
        author = "javier",
        date = LocalDateTime.of(2022,Month.APRIL,22,20,47)
    )

    println(obPost.publish())


    fun blanck(string: String):String{
        var result:String = "valor nulo"
        if (string.isNotBlank()) {
          result =   "No tiene blanco"
            if (string.isNotEmpty()){
                result = "No esta vacia"
            }
        }

        return result
    }

    fun emtity(string: String):String{
        return if (string.isNotEmpty()) "No vacio" else "su valor es:$string"
    }

    println(blanck("j"))
    println(blanck(""))

}