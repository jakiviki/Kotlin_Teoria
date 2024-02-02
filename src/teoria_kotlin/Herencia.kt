package teoria_kotlin

fun main() {

    println("OBJETO COCHE++++++++++++")
    var coche = Coche("coche",false,"polo")
    coche.arrancar()

    val volswagen = CocheData("polo")
    val mercedes = CocheData("polo")
    println("EQUALS DE LOS DATACOCHES: ${volswagen.equals(mercedes)}")
    println("Son iguales los datacoches: ${volswagen == mercedes}")

    println("has los volwagen: ${volswagen.hashCode()}")
    println("has mercedes: ${ mercedes.hashCode()}")

    val seat = Coche("coche",false,"polo")

    println("Son los objetos coche iguales: ${coche == seat}")
    println("has de coche: ${coche.hashCode()}")
    println("has de seat: ${ seat.hashCode()}")

    println("equal de coche: ${coche.equals(seat)}")


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
        println("Arrancando vehiculo: ")
    }
}


// TRABAJANDO CON DOS TIPOS DE CONSTRUCTOR 1º ///////////
// EL CONSTRUCTOR SE DECLARA Y SE RELLENA EN LA PRIMERA LINEA DE LA CLASE

open class Coche(tipo: String, encendido: Boolean, modelo: String) : vehiculo(encendido, tipo) {

    var modelo: String= modelo

    override fun arrancar() {
        super.arrancar()  // esto llama la frase del padre
        println("el coche $tipo modelo: $modelo esta arrancado en coche")
    }

}


// Teoria_kotlin.ejemplo 2
// AQUI NO RELLENO EL CONSTRUCTOR EN LA PRIMERA LINEA SI NO
// HAGO USO DEL CONSTRUCTOR DENTRO DEL CUERPO DE LA CLASE

class Furgoneta : vehiculo {
    var modelo: String= ""

    // constructor llamando al constructor padre
    constructor(tipo: String, encendido: Boolean, modelo: String):super(encendido,tipo){
        this.modelo = modelo
    }

    // esta funcion no llama a la funcion padre
    override fun arrancar(){
        println("arrancando la furgoneta sin llamar al arrancar del padre")
    }
}

/*
++++++++++++++++++++++++++++++++++++++++++++++++++
herencia Teoria_kotlin.a tres niveles estos heredan de los hijos no del padre Teoria_kotlin.vehiculo
*/

// CON EL CONSTRUCTOR EN EL CUERPO DE LA CLASE

class TodoTerreno: Coche {
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


data class CocheData(val name: String)

