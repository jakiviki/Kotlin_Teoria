package Interfaces

class Ejemplo : InterfaceA, InterfaceB {
    override fun saludo() {
        println("saludo de la A")
    }

    override fun pregunta() {
        println("pregunta de la A")
    }

    override fun hablar(frase: String) {
        println("hablanco desde la A")
    }


    override fun suma() {
        println("sumo desde la b")
    }

    override fun resta() {
        println("resto desde la b")
    }


    // CUANDO DOS INTERFACES DISTINTAS TIENEN UNA FUNCION QUE SE LLAMA IGUAL
    // SE SOBREESCRIBE UN METODO Y EN EL CUERPO LLAMO AL SUPER DE LOS DOS METODOS

    override fun imprimir(frase: String) {
        super<InterfaceA>.imprimir(frase)
        super<InterfaceB>.imprimir(frase)
    }


}

fun main() {
    var ejemplo = Ejemplo()
    ejemplo.hablar("hola")
    ejemplo.pregunta()
    ejemplo.resta()
    ejemplo.saludo()
    ejemplo.imprimir("imprimiendo con el objeto")
    ejemplo.imprimirDosDelB()
    ejemplo.imprimir("imprimiendo usando dos metodos?")
    ejemplo.dibujar()
}