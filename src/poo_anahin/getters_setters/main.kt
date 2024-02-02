package poo_anahin.getters_setters

import javafx.scene.control.TextFormatter

fun main() {

    val javi = User("el Mio@ja.com","1234")
    val javi2 = User("el Mio@ja.com","1234567")
    val javi3 = User("el Mio@ja.com","123456")

    println(javi.email)
    val Bd = AddUserUsc().invoke(javi)
    val Bd2 = AddUserUsc().invoke(javi2)
    val Bd3 = AddUserUsc().invoke(javi3)
    val a = ChangeName()
    println(a("lolamaricona"))

    println()

    if (Bd != null) {
        println("EL USUARIO A SIDO REGISTRADO: ${Bd.email}")
    }else{
        println("Usuario null")
    }
    if (Bd2 != null) {
        println("EL USUARIO A SIDO REGISTRADO: ${Bd2.email}")
    }else{
        println("Usuario null")
    }
    if (Bd3 != null) {
        println("EL USUARIO A SIDO REGISTRADO: ${Bd3.email}")
    }else{
        println("Usuario null")
    }

    println("creando objeto..")


    val user = Javi("Irene")
    println("objeto-------${user.name}")
    user.name = "JAVIER FERNANDEZ"
    println( user.name)


    val ejem = Yo("yo en mayusculas")
    println(ejem.name)

}

class Javi( name: String){


     var name: String = ""
    set(value) {
        println("variable-----valor de name: $name")
        field = value.lowercase()
    }

    init {
        this.name = name
        println("init----------")
    }




}

class Yo(name: String){
    var name = name

    /*

     */

}