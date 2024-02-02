package teoria_kotlin

fun main() {

  val eje2 = Ejem2("javier","fernandez")
  val eje3 = Ejem2("javier","fernandez")
    println(eje2.toString())

    val javi = HumanoDataClass("humano","javier","varon")
    val javi2 = HumanoDataClass("humano","javier","vaon")
    println(javi == javi2)

    val owner = Ower("noe")
    println(owner)



}

// se usa la palabra constructor
// se puede omitir
// las variables no se puede inicializar para eso se usa el init
class ejem0 constructor(private val  name: String)

class ejem1(name: String){
    var name = name
        get() = field
        set(value) {
            value.lowercase().length.toString()
            field = value
        }

}

class Ejem2(name: String){

    var name = name
    private var apellido= ""

    constructor(name: String,apellido:String): this(name){
        this.apellido = apellido
    }
}


class Per(var name:String){

    var apellido= ""

    constructor(name: String,apellido:String): this(name){
        this.apellido = apellido
    }
}
data class Ower(private val name: String)
