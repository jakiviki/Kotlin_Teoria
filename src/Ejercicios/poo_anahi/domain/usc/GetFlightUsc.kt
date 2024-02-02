package Ejercicios.poo_anahi.domain.usc

import Ejercicios.poo_anahi.AirPort
import Ejercicios.poo_anahi.Flight
import Ejercicios.poo_anahi.domain.Formater
import java.math.BigDecimal
import java.time.LocalDateTime

class GetFlightUsc(
    private val formater: Formater<Flight>
) {

    fun invoke():String {
        // creamos el ob vuelo
        val obFlight = Flight(
            number = "12.222",
            aircraf = "747, boing",
            price = BigDecimal(300),
            arraival = getAirport()
        )
        val lisFlight = listOf(obFlight,obFlight,obFlight)
        return formater.formats(lisFlight)

    }

    fun getAirport(): Pair<AirPort, AirPort> {

        return Pair(
            AirPort(
                "BARAJAS", LocalDateTime.of(
                    2022, 11, 9, 20, 45
                )
            ),
            AirPort(
                "Valencia", LocalDateTime.of(
                    2022, 11, 9, 21, 50
                )
            )
        )

    }


}