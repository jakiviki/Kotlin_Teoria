fun main(args: Array<String>) {
    // declaracion con la interface
    val array1: IntArray = intArrayOf(1,2,3,4)
    println(array1.joinToString())

    // declaracion con solo el tamaño
    val array2: IntArray = IntArray(4)
    println(array2.joinToString())

    // declaracion con el tamaño pero añado un valor
    var array3: IntArray = IntArray(4) {2}
    println(array3[2])
    println(array3.joinToString())

    // declaracion con el iterator
    var array4: IntArray = IntArray(4) {it +2}
    println(array4.joinToString())

  
}


