package teoria_kotlin

// con ? podemos dejar camino a una variable para que pueda ser tambien null
var javi: String? = "Javi"
var desconocido: String? = null


fun main() {

    // el elvis operator nos devuelve un valor por defecto en caso de null

    var hijo = javi?.length  // ? si es nulo accede
    var hija = desconocido?.length ?: "hija es null"   // elvis comprueba la lenght y si no devuelve irene
    var hijas = desconocido?.length
    println("el valor de hijas: $hijas")
    println(hijo)
    println(hija)

    var hija2: Int = desconocido?.length ?: 10   // elvis comprueba la lenght y si no devuelve el valor aunque no sea del mismo tipo
    println(hija2)




}