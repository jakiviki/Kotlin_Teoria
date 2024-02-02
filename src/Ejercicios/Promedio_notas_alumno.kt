package Ejercicios

import javax.swing.JOptionPane

// calculamos el promedio de 4 notas de un alumno
var notas = DoubleArray(4)
var media = 0.0
var semestre = 0
var suma = 0.0


fun main() {

    do {

        var nota = JOptionPane.showInputDialog("INTRODUCE TU NOTA DE SIMESTRE: ")
        if (nota == null) {
            print("nota nulla //////////////////////////")
            break
        }else{
            notas[semestre] = nota!!.toDouble()
            semestre++
        }


    }while (semestre < 4 )

    notas.forEach {
        suma+= it
    }

    println("la suma es: $suma")
    println("las notas son: ${notas.joinToString()}")
    println("la media es la suma $suma : notas ${notas.size}: ${suma/notas.size}")
    media = suma/ semestre

    JOptionPane.showMessageDialog(null,"Tu media es: $media")


}



