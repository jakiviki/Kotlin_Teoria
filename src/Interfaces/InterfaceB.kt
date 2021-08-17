package Interfaces

// ADMITEN FUNCIIONES ABSTRACTAS Y CONCRETAS

interface InterfaceB: InterfaceC {
    fun suma()
    fun resta()

    fun imprimir(frase:String){
        println(frase)
    }

    fun imprimirDosDelB(){
        println("metodo publico del B")
    }

}
