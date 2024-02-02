package teoria_kotlin


// tiene que devolver una instancia tengo que llamar el metodo getinstant
class SingletonPersona {

    val name: String= ""
    val poder: String = ""

    companion object{
        private var instancia: SingletonPersona? = null

        fun getInstant (): SingletonPersona{
        if (instancia == null){
           instancia = SingletonPersona()
        }
        return instancia as SingletonPersona
        }
    }
}

object SingletonObjetPersona{
    var name: String = "vacio"
    var apellido = "vacio"

}


