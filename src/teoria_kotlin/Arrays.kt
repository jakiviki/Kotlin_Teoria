package teoria_kotlin

fun main(args: Array<String>) {
    // declaracion con la interface
    // como es intercface lo que paso es el valor y no el tamaño
    val array1: IntArray = intArrayOf(1, 2, 3, 4)
    println(array1.joinToString())


    val doubleArray = doubleArrayOf(1.3, 2.4, 4.4, 5.5)
    val arrayOfejem = arrayOf(1, 3, "javi", null, 1.9f, 4.9, 'c')

    // declaracion con solo el tamaño
    val array2: IntArray = IntArray(4)
    println(array2.joinToString())

    // declaracion con el tamaño pero añado un valor
    var array3: IntArray = IntArray(4) { 2 }
    array3[1] = 1
    println(array3[2])
    println(array3.joinToString())

    // declaracion con el iterator
    var array4: IntArray = IntArray(4) { it + 2 }
    println(array4.joinToString())


    val intArray = IntArray(8)
    println("ARRAY DE 8 VACIO PORQUE SOLO INDIQUE EL SIZE")
    println(intArray.joinToString())
    intArray[0] = 3
    intArray[1] = 1
    intArray[2] = 2
    println(intArray.joinToString())
    println(intArray.count()) // cuenta el tamaño
    println("le doy la vuelta ${intArray.reverse()}") // da la vuelta al array
    println(intArray.joinToString())
    println(intArray.sum()) // suma el array
    println(intArray.average()) // calcula el promedio
    println(intArray.sort())  // ordena el array
    println("ordeno")
    println(intArray.joinToString())
    println("vuelvo a ordenar ${intArray.reverse()}")
    println(intArray.joinToString())
    println(intArray.sort())
    println(intArray.joinToString())


    println("ARRAY LIST**********")

    // array list
    var arrayList: ArrayList<String> = arrayListOf<String>()
    arrayList.add("javi") // para añadir elementos
    arrayList.addAll(arrayOf("Irene", "pepe", "oscar")) // añadir tres de golpe
    println(arrayList.size)
    arrayList.add("yo mismo")
    println(arrayList.size)

    // ACCEDER A LOS VALORES DEL ARRAY
    var nombre = arrayList[0] // lo gurardamos en una var
    println(nombre.length) // miro la longitud
    println(nombre) // imprimo lo guardado

    // MODIFICAR LOS VALORES YA ESTABLECIDOS
    arrayList[0] = "Noelia"
    println(arrayList.joinToString())

    // BORRAR LOS VALORES DEL ARRAY
    arrayList.removeAt(3) // borrro a oscar
    println(arrayList.joinToString())

    // COMO RECORRER EL ARRAY
    arrayList.forEach {
        println(it)
    }

    println("limpio el array ${arrayList.clear()}") // borra todo el array
    println(arrayList.size) // me dice el tamaño


}


