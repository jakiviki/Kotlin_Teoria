package teoria_kotlin

// mapa cambia el valor de las cosas
// tiene que ser listas
// SE PUEDE MAPEAR A UN OBJETO

var ejemMap = listOf(1,2,3,4,5,6)
var ejemObjeto = List(5){0}

fun main() {
   var strin = ejemMap.map { numero -> numero.toDouble() }
   println(strin)

   // MAPEANDO A UN OBJETO
   var mapeadoObjeto = ejemObjeto.map {
      PersonaMap(nombre = "javi", edad = 25, sexo = "Macho")
   }
   println("MAPEADO A OBJETO PERSONA **************")
   mapeadoObjeto.forEach{
      println(it)
   }
}

// INCLUSO PUEDE SER UN OBJETO

data class PersonaMap(
   val nombre:String,
   val edad: Int,
   val sexo: String
)