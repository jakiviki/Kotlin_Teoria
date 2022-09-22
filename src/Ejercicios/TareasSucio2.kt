package Ejercicios

fun main() {

    val array= arrayOf(1,2,3,4,5,6,7,8,8,8,8,8,9,0,12)

    for (i in array){
        println("el valor del array: $i")
        if (i == 8)
            break
    }

    javi@for (a in 0..10){
        for (b in 0..10){
            println("A: $a B: $b")
            if (a == 5 && b == 5){
                break@javi
            }
        }
    }

}
