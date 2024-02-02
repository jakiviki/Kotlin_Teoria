package Ejercicios.poo_anahi.presentation.tikect

import Ejercicios.poo_anahi.Tikect
import Ejercicios.poo_anahi.domain.Formater
import java.time.format.DateTimeFormatter

class TikectIngles: Formater<Tikect> {
    override fun format(t: Tikect): String {
        val departure = t.flight.arraival.first.dateTime
        val arrival = t.flight.arraival.second.dateTime
        return  """
            Flight: ${t.flight}
            departure: ${t.flight.arraival.first}
            departure time: ${departure.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Arrival: ${t.flight.arraival.second}
            Arrival time: ${ arrival.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duration: ${t.flight.duracion}
            Price: ${t.flight.duracion}
        """.trimIndent()
    }
}