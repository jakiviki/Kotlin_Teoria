package Ejercicios.poo_anahi

import Ejercicios.poo_anahi.domain.Formater
import java.math.BigDecimal
import java.time.Duration
import java.time.format.DateTimeFormatter

data class Flight(
    val number: String,
    val aircraf: String,
    val price: BigDecimal,
    val imfoVuelo: Pair<AirPort,AirPort>,
    val duracion: Duration = Duration.between(
     imfoVuelo.second.dateTime, imfoVuelo.first.dateTime
    )
):Formater{
    override fun Format(): String {

        val origen = imfoVuelo.first
        val destino = imfoVuelo.second
        return """
            Vuelo: $number
            Aeropuerto de salida: ${origen.name}
            Hora salida: ${origen.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Aeropuerto de llegada: ${destino.name}
            Hora de llegada: ${ destino.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duracion: ${duracion}
            Price: $price
        """.trimIndent()
    }


}
