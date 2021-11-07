package Teoria_kotlin

fun main() {
    // nos permite realizar acciones en una variable y luego devolver el valor
    // parecido a run
    // se puede combinar con un safe? para mas seguridad

    val personAplay1 = PersonaAplay("javi","fernanddez",45)
    personAplay1.apply {
        nombre = "marquez"
        apellido = "el nuevo"
        edad = 19
    }.dameNombre()


}


    data class PersonaAplay(var nombre:String, var apellido:String, var edad:Int=0){
        fun dameNombre()= println("nombre: $nombre apellido: $apellido")
    }
