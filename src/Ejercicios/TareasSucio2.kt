package Ejercicios

fun main() {


    if (numers.size > 1) {
        for (i in j until numers.size){
            val iz = i -1

            if (numers[i] != numers[iz]){
                numers[j] = numers[i]
                j++
            }

        }

        println(numers.joinToString())

        for (k in j until numers.size){
            println("tamaño del array: ${numers.size}")
            numers[k] = 0

        }

        println(numers.joinToString("-","NUEVO: "))

        for (l in j until numers.size){
            println("array.size: ${numers.size}")
            println("j: $j")
            println("l: $l")

            numers.removeAt(j)
            println("borro la posicion: $j")
        }

        println(numers.joinToString())

    }else{
        println( "El arary solo tiene un valor : $numers")
    }

}

var numers = mutableListOf(0,0,1,1,2,2,3,3,4,4)
//val numers = intArrayOf(0,0,0,1,1,2,3,3,4,4,)
var j = 1