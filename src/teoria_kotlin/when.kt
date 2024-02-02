package teoria_kotlin

fun main(args: Array<String>) {

    // con when lo podemos usar normal o asociando Teoria_kotlin.a una variable o funcion

    // uso normal del when
    var pasword = "dd"
    var ejemWhen = false
    when (pasword.length) {
        0 -> println("Escribe una contraseña")
        1, 2, 3 -> println("Contraseña demasiado floja")
        in 3..5 -> println("contraseña poco segura")
        else -> println("Introduce mayusculas y numeros")
    }



    println()


    // IGUALANDO UNA FUNCION LA WHEN
    println("igualndo el when a la funcion:")
    ejemplo("jsjsj")
    println()

    // igualando un if a la funcion
    println("Igualando un if a la funcion:")
    ejemplo2("9d9d99s9s9s9")
    println()

    //DEVOLVIENDO UN OBJETO EN LA FUNCION
    println("devolviendo un objeto en la funcion")
    dameAlgo("esto es una frase")
    println()


    //IMPRIMO LA LOGICA SIN PARENTESIS
    println("IMPRIMO LA LOGICA SIN () EN EL WHEN")
    print(acceso)






}

// crear una funcion que devuelva un elemento usando una when

fun dameAlgo(objeto: Any): Any{
    var resultado = when(objeto){
        is Int -> println("es un Entero: $objeto")
        is String -> println(" es un string $objeto")
        in 1..100 -> println(" es un nuemro entero: $objeto")
        else -> println(" es cualquier cosa: $objeto")
    }

    return resultado
}


// añadimos un when Teoria_kotlin.a una funcion
fun ejemplo(password: String) = when (password.length) {
    0 -> println("Escribe una contraseña")
    1, 2, 3 -> println("Contraseña demasiado floja")
    in 3..5 -> println("contraseña poco segura")
    else -> println("Introduce mayusculas y numeros")
}

fun ejemplo2(password: String) = if (password.length < 10){
    println("La contraseña tiene que ser mayor de 10")
}else {
    println("Contraseña correcta")
}

// USANDO VARIAS LOGICAS SIN EL ()
val usuarioisLoged= true
val mayorEdad = true

val acceso = when{
    usuarioisLoged and  mayorEdad -> "hola javi tienes acceso"
    !usuarioisLoged || !mayorEdad -> "no tinees acceso javi"
    else -> "null"
}



