package teoria_kotlin

fun main(args: Array<String>) {
    // THE GOOD CODE
    // CON EL BREAK SALTAMOS DEL EN EL MISMO FOR AL SIGUIENTE NUMERO EN ESTE CASO EL 6
    for (a in 1..10) {
        for (b in 1..10) {
            println("$a: $b")
            if (a == 5 && b == 5) {
                println("ECUADOR DE LOS DOS FOR")
                break
            }

            if (b == 5) {
                println("++++++++++ ecuador  del for interno")
            }
        }
        println("+++++ Salto a siguiente numero $a")
    }

    miImpresion(" Con un break y un exit en el primer for")
    // ahora saliendo de los dos

    exit@ for (a in 1..10) {
        for (b in 1..6) {
            println("$a: $b")
            if (a == 5 && b == 3) {
                println("estamos en el ecuador y voy Teoria_kotlin.a salir de los dos For")
                break@exit
            }
            if (b == 6) {
                println("++++++++++++ fin del segundo for")
            }
        }
    }

    miImpresion(" Con un break y un exit en el SEGUNDO  for")

    miImpresion("con 3 For: ............")


    for (a in 1..10) {
        exit@ for (b in 1..10) {
            for (c in 1..6) {
                println("a:$a b:$b c:$c")
                if (a == 5 && b == 5 && c == 3) {
                    println("estamos en el ecuador y salgo del 5 en los dos dejando el primero correr")
                    break@exit
                }
                if (c == 6) {
                    println("++++++++++++ fin del tercer for")
                }
            }

            if (b == 10) {
                println("++++++++++++ fin del segundo for")
            }
        }
    }

}

fun miImpresion(frase: String) {
    println("++++++++++++++++++++++++$frase +++++++++++++++++++++++++++++++++")
}