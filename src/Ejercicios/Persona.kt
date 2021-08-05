package Ejercicios

import kotlin.properties.Delegates

class Persona (nombre:String,apellido:String?){
    var nombre:String?= nombre
    var apellido: String? = apellido
    var ssh = 0



    fun hablar(frase: String){
        println(frase)
    }

}

class Coche (marca:String,precio:Int,modelo:String){
    var marca:String = marca
    var precio = precio
    var modelo: String = modelo
    var bonus: Int = 0

    init {
        if (modelo == "Polo") bonus = 20
    }
}
