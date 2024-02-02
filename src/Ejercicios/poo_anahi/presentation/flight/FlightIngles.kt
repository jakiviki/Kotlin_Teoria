package Ejercicios.poo_anahi.presentation.flight

import Ejercicios.poo_anahi.Flight
import Ejercicios.poo_anahi.domain.Formater
import java.time.format.DateTimeFormatter

class FlightIngles: Formater<Flight> {
    override fun format(t: Flight): String {
        val departure = t.arraival.first.dateTime
        val arrival = t.arraival.second.dateTime
        return  """
            Flight: ${t.number}
            Departure: ${t.arraival.first}
            Departure time: ${departure.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Arrival: ${t.arraival.second}
            Arrival time: ${ arrival.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duration: ${t.duracion}
            Price: ${t.price}
        """.trimIndent()
    }
}