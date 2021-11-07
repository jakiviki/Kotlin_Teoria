package Teoria_kotlin

import com.sun.xml.internal.fastinfoset.util.StringArray

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



    // array list
    var array5 = arrayListOf<String>()
    array5.add("javi") // para añadir elementos
    array5.addAll(arrayOf("Irene","pepe","oscar")) // añadir tres de golpe

    // ACCEDER A LOS VALORES DEL ARRAY
    var nombre = array5[0] // lo gurardamos en una var
    println(nombre.length) // miro la longitud
    println(nombre) // imprimo lo guardado

    // MODIFICAR LOS VALORES YA ESTABLECIDOS
    array5[0] = "Noelia"
    println(array5.joinToString())

    // BORRAR LOS VALORES DEL ARRAY
    array5.removeAt(3) // borrro a oscar
    println(array5.joinToString())

    // COMO RECORRER EL ARRAY
    array5.forEach{
        println(it)
    }

    // INTERES
    array5.count() // cuenta el tamaño
    array5.clear() // borra todo el array
    array5.count()





  
}


