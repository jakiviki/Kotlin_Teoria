package Ejercicios.poo_anahi.presentation.tikect

import Ejercicios.poo_anahi.Tikect
import Ejercicios.poo_anahi.domain.Formater
import java.time.format.DateTimeFormatter

class TikectConsole: Formater<Tikect> {
    override fun format(t: Tikect): String {
        val salida = t.flight.arraival.first.dateTime
        val arrival = t.flight.arraival.second.dateTime
        return  """
            Vuelo: ${t.flight}
            Aeropuerto de salida: ${t.flight.arraival.first}
            Hora salida: ${salida.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Aeropuerto de llegada: ${t.flight.arraival.second}
            Hora de llegada: ${ arrival.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duracion: ${t.flight.duracion}
            Price: ${t.flight.duracion}
        """.trimIndent()
    }
}