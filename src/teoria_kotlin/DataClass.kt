package teoria_kotlin
// lo primero que se puede notar a diferencia de una clase es que no hace falta las funciones
// y que los atributos se declaran en el constructor
// LAS DATACLASS COMPARAN CON EL METODO EQUALS LOS ATRIBUTOS Y NO LAS DIRECIONES DE MEMORIA COMO
// LAS CLASES NORMALES
// TAMBIEN EL METODO PRINT ES DIFERENTE YA QUE IMPRIME LOS ATRIBUTOS Y NO LA DIRECION EN MEMORIA

fun main() {
    // varias formas de llamar al objeto dataclass
    val objetoHumano: HumanoDataClass = HumanoDataClass("Blanco","javier","hombre")
    val objetoHumano2: HumanoDataClass = HumanoDataClass(nombre = "javier",sexo = "macho",raza = "negro")

    val objetoHumano3 = HumanoDataClass("blanco",sexo = "mujer",nombre = "susana")
    val objetoHumano4 = HumanoDataClass("blanco",sexo = "mujer",nombre = "susana")

    val humanito = HumanitoClass("humana","nombre class")
    val humanito2 = HumanitoClass("humana","nombre class 2")

    println("HAS DE CLASE 1${humanito.hashCode()}")
    println("HAS DE CLASE2 ${humanito2.hashCode()}")


    // una vez crado el objeto la val no se puede cambiar
    // en este caso raza es val y nombre es var

    objetoHumano.nombre = "paco"
    // objetoHumano.raza = "perro"   .error no compilaria

    // COMPARANDO EL HAS DE DOS CLASES NORMALES
    println("SON IGUALES LOS OBJETOS DE CLASES?: ${humanito == humanito2}")

    // COMPROBANDO DOS DATACLAS CON CONTENIDO IGUAL
    println("SON IGUALES LAS DATACLAS CON CONTENIDO IGUAL:? ${objetoHumano3 == objetoHumano4}")

    // COMPARANDO OBJETOS PARA VER QUE NO LO HACE CON LAS DIRECONES DE MEMORIA
    println("SON IGUALES LOS OBJETOS 1 Y 2 CON CONTENIDO DISTINTO?: ${objetoHumano == objetoHumano2}")

    println()
    println("comparando el metodo print de las class.......")
    println(objetoHumano)
    println(objetoHumano2)
    println(objetoHumano3)
    println()
    println("comparando el metodo print de las dataclass.......")
    println(humanito)
    println(humanito.nombre)
}

data class HumanoDataClass(val raza: String, var nombre: String, var sexo: String)

class  HumanitoClass(val raza: String, var nombre: String = "")

