package Teoria_kotlin

// se usa la palabra constructor
// se puede omitir
// las variables no se puede inicializar para eso se usa el init
class Ower()

class ejem0 constructor( name: String)

class ejem1(name: String){
    var name = name
        get() = field
        set(value) {field = value}

    init {

    }
}

class Ejem2(name: String){

    var name = name
    var apellido= ""

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

fun main() {
    val perro = Per("Teoria_kotlin.getJavi")
    val perro2 = Per("oscar","gonzalez")
    val perrete = Per("Javiercillo")

    println(perro.apellido)
    println(perro2.apellido)
}