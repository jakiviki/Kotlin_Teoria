package Teoria_kotlin

// en kotlin no hace falta crear los metodos getter y seters
// para eso lo hacemos debajo de cada atributo
fun main() {

    // podemos crear un objeto y añadir valor a los atributos sin los set a difeerencia de java
    // ejem...
    var objetoUsuario = Usuario("Teoria_kotlin.getJavi", "blanco", "9089")
    var ojUsuario2 = Usuario("Teoria_kotlin.getJavi", "negro", "00")


    println("sin modifificar")
    println(objetoUsuario.pass)
    objetoUsuario.pass = "passchange"
    println("modificado: ${objetoUsuario.pass}")
    println(ojUsuario2.pass)
    println(ojUsuario2.toString())


    val obUsu = Usu("javi","el mio")
    obUsu.apellido

}

class Usuario(nombre: String, raza: String, password: String) {
    private var nombre = nombre
    private var raza = raza
    var pass = password
            get() = field
            set(value) {
                if (value.length < 16) print("la contraseña no es segura")
                field = value
            }


}

 class Usu (val name: String, val apellido:String)

