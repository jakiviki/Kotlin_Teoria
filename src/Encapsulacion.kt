// en kotlin no hace falta crear los metodos getter y seters
// para eso lo hacemos debajo de cada atributo
fun main() {

    // podemos crear un objeto y añadir valor a los atributos sin los set a difeerencia de java
    // ejem...
    var objetoUsuario = Usuario("javi","blanco","9089")


    println(objetoUsuario.pass)

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

