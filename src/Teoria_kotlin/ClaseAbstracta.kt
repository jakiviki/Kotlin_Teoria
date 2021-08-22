package Teoria_kotlin/*
NORMA DE LAS CLASES ABSTRACTAS
* DICEN LO QUE VAN A HACER PERO NO COMO, ESO LO DECIDEN LOS HIJOS Y LOS NIETOS
* NO SE PUEDEN GENERAR OBJETOS ES DECIR NO INSTANCIA
* PUEDE TENER METODOS ABSTRACTOS O NORMALES
* UNA CLASE NORMAL O CONCRETA QUE DECLARA UNA FUNCION ABSTRACTA ESTA OBLIGADA A QUE SE CONVIERTA EN ABSTRACTA
* LAS FUNCIONES NO PUEDEN TENER CUERPO ESO LO DECLARAN LOS HIJOS Y LOS NIETOS
* UNA CLASE NORMAL O CONCRETA QUE HEREDA DE UNA ABAST ESTAN OBLIGADAS A IMPLEMENTAR LOS METODOS ABASTRACTOS DEL PADRE
 */


abstract class Vehiculo(
    var tipo: String = ""

) {
    abstract fun arrancar()  // esto se define en los hijos y nietos porque cada uno arranca de una manera por ejm
    abstract fun acelerar() // porque cada uno acelera de una manera cada hijo dice como acelera

    open fun frenar() = println("Tocando el freno hasta frenar del todo, en Teoria_kotlin.vehiculo")
}


// clase hija no abstracta que tiene la obligacion de implementar los metodos
// si fuera abstracta la obligacion de implementar pasaria al nieto y asi hacia abajo
class Bicicleta(tipo: String,marca:String): Vehiculo(tipo){
    var marca= marca

    override fun arrancar() {
        println("Arrancando en bici: Empiezo Teoria_kotlin.a peladear")
    }

    override fun acelerar() {
        println("Meto potencia en las piernas y acelero en  la bici")
    }

    // solo si quiero hacer algo diferente si no lo llamo en el objeto
    override fun frenar(){
        super.frenar()
        println("sin tocar el freno delantero")
    }

}


/*
++++++++++++++++++++++++++++++++++++++++++++++++++
herencia Teoria_kotlin.a tres niveles estos heredan de los hijos no del padre Teoria_kotlin.vehiculo
*/

//

// clase Objeto no hace falta crear un objeto para acceder Teoria_kotlin.a sus atributos
// y tampoco el apodo de class en la declaracion
object Perro {
    var raza: String = "caniche"
    var nombre: String = "kali"
}


fun main() {

    println("CREANDO EL OBJETO BICI************************")
    var objetoBici = Bicicleta("paseo","BH")
    println("bici ${objetoBici.marca}")

    // llamamos al objeto abstracto es como si ya estuviera echo el objeto
    println(Perro.nombre)
}