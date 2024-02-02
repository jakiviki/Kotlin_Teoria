package teoria_kotlin

// CREA INSTANCIAS O CONSTANTES
// 3 MANERAS SIMPLES,CONSTRUCTOR,PROPIEDADES Y FUNCIONES

fun main() {

    val objAmarillo = Color.YELLOW
    println(objAmarillo)

    val obServivo = Raza.HUMANA.tipo
    println(obServivo)

    val obEspaña = Pais.ESPAÑA.continente
    val habEspaña = Pais.ESPAÑA.habitantes

    println("España: ${obEspaña}")
    println("España habitantes: $habEspaña")


}

enum class Color{
    WHITE,
    BLACK,
    YELLOW
}
enum class Raza(val tipo: String){

    HUMANA("Carniboro"),
    PERRO("Carniboro"),
    RATA("hervivoro")
}


// AL DEFINIR LOS ATRIBUTOS ABSTRACT LOS TENGO QUE IMPLEMENTAR EN LAS INSTANCIAS
enum class Pais(val habitantes: Int){
    ESPAÑA(40) {
        override val continente: String
            get() = "Europeo"

        override fun getRecursos(): String {
            return   "Sol"
        }
    },
    INGLATERRA(50) {
        override val continente: String
            get() = "Europeo"

        override fun getRecursos(): String {
           return "Gas"
        }
    },
    AMERICA(80) {
        override val continente: String
            get() = "Americano"

        override fun getRecursos(): String {
          return "Petroleo,gas,sol"
        }
    };

    // TIENEN QUE SER LOS ULTIMOS
    abstract  val continente: String
    abstract fun getRecursos(): String
}
