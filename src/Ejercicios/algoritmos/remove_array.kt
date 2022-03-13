package Ejercicios.algoritmos


// elimina los numero repetido de un array ordenado de mayor a menor

/*
estrategia : comparar de dos en dos y ver si el de la izquierda es diferencte a el
de la derecha, como son ordenados esto dara un numero diferente lo cual es el
que meto en el nuevo array para eso usu otra variable j
 */

fun main() {

    val myArray1 = intArrayOf(1,1,1,4,4,5,5,5,5,6,7,8,8,9,9)
    // lo uso para el indice, empiezo en uno porque el 0 siempre sera el mas bajo en el array
    var x = 1

    if (myArray1.size > 1){

        // uso los indices del for para jugar con las posiciones
        for (i in 1 until myArray1.size){
            val izq = i -1

            // algoritmo: comparo el de la izquierda
            // x solo se incrementa las veces que ordena eso quiere
            // decir que se queda en 6
            if (myArray1[i] != myArray1[izq] ){
                myArray1[x] = myArray1[i]
                x++
                println( "valor de x: $x")

            }
        }

    }
    println(myArray1.toList())
    println("************ los repetidos los limpio a valor 0 *********")
    // sigo desde el indice donde se quedo x y lo limpio
    for (k in x until myArray1.size){
        myArray1[k] = 0
    }

    println(myArray1.toList())

    // podemos filtrar u borrar con metodos pero es mas memoria
    val newArray = myArray1.filter {
        it >=1
    }
    println(newArray.toList())


    val name = intArrayOf(1,1,2,2,3,3,4,4)
    var newIndex = 1

    for (i in 1 until name.size){
        val iz = i-1
         if (name[iz] != name[i]){
             name[newIndex] = name[i]
             newIndex++
         }
         println(name[newIndex])

    }

    println(name.toList())


}