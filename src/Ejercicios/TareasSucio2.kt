package Ejercicios

fun main() {

    superior(contar(12))
    superior(contar2)

}

fun superior(validate:(String)-> Unit){
    var myName = "javier"
    validate(myName)
}

fun contar(int: Int): (String)->Unit {
    return {
        println(int+it.length)
    }
}

val contar2: (String)->Unit = {
    println(it.indices)
}




