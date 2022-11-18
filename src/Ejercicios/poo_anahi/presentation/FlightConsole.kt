package Ejercicios.poo_anahi.presentation

import Ejercicios.poo_anahi.Flight
import Ejercicios.poo_anahi.domain.Formater
import java.lang.String.format
import java.lang.StringBuilder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


// principio solid
// AHORA TENGO LA CLASE EXPECIFICA QUE IMPRIME EN ESTE FORMATO EN VEZ DE EN EL FLIGTH

class FlightConsole: Formater<Flight> {
    override fun format(t: Flight): String {
        val salida = t.arraival.first.dateTime
        val arrival = t.arraival.second.dateTime
      return  """
            Vuelo: ${t.number}
            Aeropuerto de salida: ${t.arraival.first}
            Hora salida: ${salida.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Aeropuerto de llegada: ${t.arraival.second}
            Hora de llegada: ${ arrival.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duracion: ${t.duracion}
            Price: ${t.price}
        """.trimIndent()
    }


}