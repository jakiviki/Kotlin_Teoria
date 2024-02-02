package teoria_kotlin

// en kotlin no hace falta crear los metodos getter y seters
// para eso lo hacemos debajo de cada atributo
fun main() {

    // podemos crear un objeto y añadir valor a los atributos sin los set a difeerencia de java
    // ejem...
    var objetoUsuario = Usuario("Javi", "blanco", "9089")
    var ojUsuario2 = Usuario("Noe", "negro", "00")


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
            set(value) {
                if (value.length < 16) print("la contraseña no es segura")
                field = value
            }
            get() = field


}

 class Usu (val name: String, val apellido:String)

