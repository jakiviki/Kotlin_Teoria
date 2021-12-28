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
        this.name = name
        this.apellido = apellido
    }
}


class per(name:String){

    var name = ""
    var apellido= ""

    constructor(name: String,apellido:String): this(name){
        this.name = name
        this.apellido = apellido
    }
}

fun main() {
    val perro = per("Teoria_kotlin.getJavi")
    val perro2 = per("oscar","gonzalez")

    println(perro.apellido)
    println(perro2.apellido)
}