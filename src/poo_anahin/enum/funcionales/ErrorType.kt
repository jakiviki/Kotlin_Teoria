package poo_anahin.enum.funcionales

enum class ErrorType(val meesage: String) {
    SIN_CONEXION("NO TIENE CONEXION") {
        override val tlf: Int = 91234555
        override fun getUsuario() = "javier"
    },
    NO_LOGEADO("NO ESTA LOGEADO") {
        override val tlf: Int = 89999999
        override fun getUsuario() = "Amelie"
    },
    MENOR_EDAD("ES USTED MENOR DE EDAD") {
        override val tlf: Int = 6758940
        override fun getUsuario() = "Carmencita"

        override fun getCode(): Int {
            return 89990
        }
    };

     abstract val tlf : Int
     abstract fun getUsuario(): String

     // este no es obligatorio y si hace falta se sobreescribe
     open fun getCode() = 0


}