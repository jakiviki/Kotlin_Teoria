import kotlin.concurrent.fixedRateTimer

fun main() {

    println("OBJETO COCHE++++++++++++")
    var coche = Coche("coche",false,"polo")
    coche.arrancar()

    println("OBJETO FURGONETA +++++++++++++")
    var furgoneta = Furgoneta("furgoneta",true,"zafiro")
    furgoneta.arrancar()

    println("OBJETO NIETO TODOTERRENO+++++++++++++")
    var todoTerreno = TodoTerreno("2.00","nisan",false,"ancara")
    println(todoTerreno.arrancar())
    println(todoTerreno.tipo)

    println("OBJETO DE COCHE DE CARRERAS++++++++++++++++++")
    val carreras = Carreras("3.000","ferrari",false,"f40")
    println(carreras.detalles())
    println(carreras.encendido)



}

open class vehiculo(
    var encendido: Boolean= false,
    var tipo: String = ""
) {
    open fun arrancar(){
        println("Arrancando en vehiculo: ")
    }
}


// TRABAJANDO CON DOS TIPOS DE CONSTRUCTOR 1º ///////////
// EL CONSTRUCTOR SE DECLARA Y SE RELLENA EN LA PRIMERA LINEA DE LA CLASE

open class Coche(tipo: String, encendido: Boolean, modelo: String) : vehiculo(encendido, tipo) {

    var modelo: String= modelo

    override fun arrancar() {
        super.arrancar()  // esto llama a la frase del padre
        println("el coche $tipo modelo: $modelo esta arrancado en coche")
    }

}


// ejemplo 2
// AQUI NO RELLENO EL CONSTRUCTOR EN LA PRIMERA LINEA SI NO
// HAGO USO DEL CONSTRUCTOR DENTRO DEL CUERPO DE LA CLASE

class Furgoneta : vehiculo{
    var modelo: String= ""

    // constructor llamando al constructor padre
    constructor(tipo: String, encendido: Boolean, modelo: String):super(encendido,tipo){
        this.modelo = modelo
    }

    // esta funcion no llama a la funcion padre
    override fun arrancar(){
        super.arrancar()
        println("arrancando la furgoneta sin llamar al arrancar del padre")
    }
}

/*
++++++++++++++++++++++++++++++++++++++++++++++++++
herencia a tres niveles estos heredan de los hijos no del padre vehiculo
*/

// CON EL CONSTRUCTOR EN EL CUERPO DE LA CLASE

class TodoTerreno: Coche{
    var motor: String =""

    constructor(motor: String,tipo: String,encendido: Boolean,modelo: String):super(tipo,encendido,modelo){
        this.motor = motor
    }

    override fun arrancar() {
        super.arrancar()
        println("pongo la reductora en todo terreno nieto")
    }
}

// CON EL CONSTRUCTOR EN LA DECLARACION DE LA CLASE

class Carreras(motor: String,tipo:String,encendido:Boolean,modelo:String) : Coche(tipo,encendido,modelo){
    var motor:String = motor

    override fun arrancar() {
        super.arrancar()

        println("metiendo la llave en el contacto")
    }

    fun detalles(){
        println("el $modelo tiene un motor de $motor y es un coche de $tipo")
    }

}

