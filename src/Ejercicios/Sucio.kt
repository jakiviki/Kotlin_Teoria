package Ejercicios

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer
import javax.swing.JOptionPane

fun main() {
    arraysList()

}

fun arraysList(){
    var elementos: Int = JOptionPane.showInputDialog("INTRODUCE UN TAMAÑO JAVI").toInt()
    var listaEstatica: Array<Int?> = arrayOfNulls<Int>(elementos)

    for (i in 0 until elementos){
        listaEstatica[i] = JOptionPane.showInputDialog("Introduce un valor").toInt()
    }

    println("ESTA ES TU LISTA JAVI")
    listaEstatica.forEach {
        println(it)
    }

    var arrayLlistDinamica = ArrayList<Int>()
    var respuesta:Char
    do {
        arrayLlistDinamica.add(JOptionPane.showInputDialog("Añade valores a la lista dinamica").toInt())
        respuesta = JOptionPane.showInputDialog("Quieres continuar: S/N")[0]

    }while (respuesta == 's' || respuesta == 'S')

    println("ESTA ES TU LISTA JAVI")
    arrayLlistDinamica.forEach {
        println(it)
    }



}



