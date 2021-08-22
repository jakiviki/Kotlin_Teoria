package Teoria_kotlin

fun main(args: Array<String>) {
    setTitulo("hola Teoria_kotlin.getJavi")
    println(getTitulo("hola campeon"))
}

// funciones seter
fun setTitulo(titulo:String){
    println("*************** $titulo ***************")
}

// funciones geter
fun getTitulo(titulo: String): String{
    var dibujo = "***************"
    dibujo += titulo
    return dibujo
}
