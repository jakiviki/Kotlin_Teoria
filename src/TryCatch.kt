import java.lang.NullPointerException

/// Usa el try catch siempre que uses el doble !! para no tener problemas
fun main() {
    var nombre: String? = null

    try {
        nombre!!.length
    }catch (longitud: NullPointerException){
        println("La variable es nula")
    }
}