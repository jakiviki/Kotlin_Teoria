package Teoria_kotlin

// en kotlin no hace falta crear los metodos getter y seters
// para eso lo hacemos debajo de cada atributo
fun main() {

    // podemos crear un objeto y añadir valor Teoria_kotlin.a los atributos sin los set Teoria_kotlin.a difeerencia de java
    // ejem...
    var objetoUsuario = Usuario("Teoria_kotlin.getJavi","blanco","9089")
    var ojUsuario2 = Usuario("Teoria_kotlin.getJavi","negro","00")


    println(objetoUsuario.pass)
    println(ojUsuario2.pass)
    println(ojUsuario2.toString())

}

class Usuario (nombre:String,raza: String,password: String){
    var nombre= nombre
    var raza = raza
    var pass = password
        get() = field
        set(value) {
            if (value.length < 6) print("la contraseña no es segura")
            field = value
        }


}

