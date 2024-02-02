package Ejercicios

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer
import sun.rmi.runtime.Log
import java.math.RoundingMode
import java.text.DecimalFormat
import javax.swing.JOptionPane
import kotlin.math.roundToInt

fun main() {

    println(false == false)
    println(true == false)
    println(true)

    val list = listOf(1,7,6,7,6,1,1,1,1,1,1,1)
    val promedio = list.average()
    println("promedio: $promedio")

    val formatter = String.format("%.1f", promedio)
   // val formatter2 = formatter.toDouble()

    when(formatter){
        in "0.0".."1.0"-> println("ahora siii $formatter")
        in "1.1".."2.0"-> println("ahora siii $formatter")
        in "2.1".."3.0"-> println("ahora siii $formatter")
        else -> println("menuda mierda")
    }
    println(formatter)
    println("usando almoadilla # ")
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.DOWN
    val roundoff = df.format(promedio)
    println(roundoff)

    println("Usando la division con los ceros para poner dos digitos")
    val business = listOf(2,2,4,5,6,7,8,9,9,9,8,7,6,5)
    val valuation = business.average()
    val roundOff = (valuation * 100.0).roundToInt() / 100.0
    // los 00 representan los decimales a mostrar
    println(roundOff)


    val ran= (0..5).random()
    println("random")
    println(ran)
    val ran1= (0..5).random()
    println("random")
    println(ran1)
    val ran2= (0..5).random()
    println("random")
    println(ran2)
    val ran3= (0..5).random()
    println("random")
    println(ran3)




}



