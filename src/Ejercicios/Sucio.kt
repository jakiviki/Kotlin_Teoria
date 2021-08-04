package Ejercicios

fun main() {
// OBJETO DELFIN
    var delfin = Delfin("mamifero", "delfin", "todo el oceano", "comun")


}

abstract class SerVivoAb(tipo: String, especie: String) {
    var tipo = tipo
    var especie = especie

    abstract fun respirar()


}

class Delfin(
    tipo: String,
    especie: String,
    situacionGeografica: String,
    nombre: String
) : SerVivoAb(tipo, especie) {
    override fun respirar() {
        TODO("Not yet implemented")
    }


}