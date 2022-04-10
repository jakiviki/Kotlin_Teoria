package paquetePruebas



fun main(args: Array<String>) {

    println(Javi().toString())
    val maquina = Javi()
    val maquina2 = Javi()

    println(maquina.hashCode())
    print(maquina2.hashCode())
}

class Javi{

    val name: String
    val apellido: String

    init {
        this.name = "javi"
        this.apellido = "fernanda"
    }
}
