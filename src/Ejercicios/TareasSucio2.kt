package Ejercicios

import Teoria_kotlin.SingletonObjetPersona.apellido
import Teoria_kotlin.name

fun main() {

val obj2 = PersonaHumana("javi","fernandez",45)

    println("apellido: "+obj2.apellido)

}


class PersonaHumana ( var name: String ,val apellido: String){

    var edadp = 0


    constructor(name: String,apellido: String,edad:Int):this(apellido = apellido,name = name){
        this.edadp = edad
    }




}

