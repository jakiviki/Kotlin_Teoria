package Teoria_kotlin


// lo que ponemos dentro de los parentesis si nos devuelve algo
// como un objeto podemos acceder a su interior, metodos y propertis

fun main(args: Array<String>) {
    val personaRun1 = personaRun("javi", "del olmo",19)
    val personaRun2 = personaRun("javi", "del olmo",45)


    println("imprimo con devolucion del objeto")
    // EJEM: AQUI DEVUELVE UN OBJETO Y ACCEDO A SUS PROPIEDADES
    run {
        if (personaRun1.edad > personaRun2.edad) personaRun1 else  personaRun2
    }.dameNombre()

    println("devuelvo edad sin usar println")
    run {
        if (personaRun1.edad > personaRun2.edad) personaRun1 else  personaRun2
    }.edad

    println("metido la logica en un println")
    // AQUI NO PUEDO ACCEDER AL OBJETO
    println(if (personaRun1.edad > personaRun2.edad) personaRun1 else  personaRun2)

    println("sin logica y sin imprimir")
    // compruebo si me sirve sin logica
    run {
        personaRun1
    }.apellido



}

data class personaRun(var nombre:String, val apellido:String, var edad:Int=0){
    fun dameNombre()= println("nombre: $nombre apellido: $apellido")
}