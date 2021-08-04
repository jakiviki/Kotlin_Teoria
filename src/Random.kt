import kotlin.random.Random

fun main() {
    // crear un bucle while que se rompa con un numero indeterminado

    while (true){
        var ramdom = Random(System.nanoTime()).nextInt(1,10)
        println("El numero es: $ramdom")

        if (ramdom == 5){
            println("Enorabuhena has acertado el numero es: $ramdom")
            break
        }
    }

        println("**************")
    do {
        var ramdom = Random(System.nanoTime()).nextInt(1,10)
        println("El numero en do while es: $ramdom")

        if (ramdom == 5){
            println("Enorabuhena has acertado el numero es: $ramdom")
            break
        }
    }while (true)
}