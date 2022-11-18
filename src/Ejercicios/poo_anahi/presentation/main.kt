package Ejercicios.poo_anahi.presentation

import Ejercicios.poo_anahi.AirPort
import Ejercicios.poo_anahi.Flight
import Ejercicios.poo_anahi.Tikect
import java.math.BigDecimal
import java.time.LocalDateTime

fun main() {

    // creamos el ob vuelo
    val obFlight = Flight(
        number = "12.222",
        aircraf = "747, boing",
        price = BigDecimal(300),
        arraival = getAirport()
    )

    // creamos el ob vuelo
    val obFlight2 = Flight(
        number = "12.222",
        aircraf = "747, boing",
        price = BigDecimal(300),
        arraival = getAirport()
    )

    val tikect = Tikect(
        baggage = "solo una",
        flight = obFlight2,
        passenger = "Javier",
        seat = 12
    )

    val obFligthConsole = FlightConsole()
    val obTicectConsole = TikectConsole()

    // vemos la interface
    println(obFlight == obFlight2)
    println(obFlight)
    println("---------------")

    println(obFligthConsole.format(obFlight))
    println("---------------")
    println(obTicectConsole.format(tikect))
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