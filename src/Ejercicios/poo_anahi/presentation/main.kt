package Ejercicios.poo_anahi.presentation

import Ejercicios.poo_anahi.AirPort
import Ejercicios.poo_anahi.Flight
import java.math.BigDecimal
import java.time.LocalDateTime

fun main() {

    // creamos el ob vuelo
    val obFlight = Flight(
        number = "12.222",
        aircraf = "747, boing",
        price = BigDecimal(300),
        imfoVuelo = getAirport()
    )

    // vemos la interface
    println(obFlight.Format())
}

fun getAirport(): Pair<AirPort,AirPort>{

    return Pair(
        AirPort("BARAJAS", LocalDateTime.of(
            2022,11,9,20,45
        )),
        AirPort("Valencia", LocalDateTime.of(
            2022,11,9,21,50
        ))
    )

}