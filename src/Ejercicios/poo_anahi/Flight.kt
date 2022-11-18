package Ejercicios.poo_anahi

import java.math.BigDecimal
import java.time.Duration

data class Flight(
    val number: String,
    val aircraf: String,
    val price: BigDecimal,
    val arraival: Pair<AirPort,AirPort>,
    val duracion: Duration = Duration.between(arraival.second.dateTime, arraival.first.dateTime)
)