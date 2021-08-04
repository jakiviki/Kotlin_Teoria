package Ejercicios

import kotlin.math.min

// convertir horas a minutos
// 1 hora = 60 minutos
// 1 hora = 3600 segundos

fun main() {
    horas()
}

fun horas(){
    var hora = 5
    var segundos = hora * 3600
    var minutos = hora * 60
    println(" los segundos de hora son: $segundos")
    println("los minutos de hora son: $minutos")
}