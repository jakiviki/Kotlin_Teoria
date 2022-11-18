package Ejercicios.poo_anahi.domain

import java.lang.StringBuilder

// LA SEGUNDA AL LLEVAR COMPORTAMIENTO YA NO ES OBLIGATORIO SU IMPLEMENTACION

interface Formater<T> {
    fun format(t:T):String
    fun formats(ts: List<T>):String{
        val stringBuilder = StringBuilder()
        ts.forEach {
            stringBuilder.appendLine(format(it))

        }
        return stringBuilder.toString()
    }
}
