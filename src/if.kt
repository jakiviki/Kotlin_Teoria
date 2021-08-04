fun main(args: Array<String>) {
    // llamo a la funcion de una sola linea
    soloUnaLinea()
    usoNormal()
    dentroVariable()
}

/*
    3 maneras de declarar el if
    1 en una sola linea
    2 con un bloque normal
    3 asociandolo a una variable
 */

// en una sola linea
fun soloUnaLinea(){
    var a = "hola"
    var b = "adios"
    var masLong = ""

    if (a.length < b.length) println(" la palabra mas larga es $b ")
    if (a.length < b.length) masLong = b
    println("el valor de b es = $b")
}

fun usoNormal(){
    var a = 1
    var b = 2
    var c = 0

    if (a < b ){
        c = b-a
    }else{
        c= a-b
    }

    println(c)
}

fun dentroVariable(){
    var a = true
    var b = if (a){
        println("a es verdadera")
        a
    }else {
        println("a es falso")
        b
    }
}
