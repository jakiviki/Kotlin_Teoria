package Teoria_kotlin// para obtener la hora actual tenemos que importar del paquete java  la clase Instant y usar el metodo now

import java.time.Instant
import java.time.ZoneId

var horaActual = Instant.now()
fun main() {
    println(" la hora actual es: $horaActual")

    // para zona determinada Teoria_kotlin.ejemplo polo sur
    var polosur = horaActual.atZone(ZoneId.of("Antarctica/South_Pole"))
    println(polosur)
}