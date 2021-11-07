package Teoria_kotlin

// igual que el aplay pero necesitamos el iterador it

fun main() {
    // nos permite realizar acciones en una variable y luego devolver el valor
    // parecido a run
    // se puede combinar con un safe? para mas seguridad
    // como devuelve el objeto podemos acceder a el

    val personaAlso1 = PersonaAlso("javi","fernanddez",45)

    personaAlso1.also {
        it.nombre = "marquez"
        it.apellido = "el nuevo"
        it.edad = 19
    }.dameNombre()

    println(
        personaAlso1
    )


}


data class PersonaAlso(var nombre:String, var apellido:String, var edad:Int=0){
    fun dameNombre()= println("nombre: $nombre apellido: $apellido")
}
