package Ejercicios.poo_anahi.presentation

import Ejercicios.poo_anahi.AirPort
import Ejercicios.poo_anahi.Flight
import Ejercicios.poo_anahi.Tikect
import Ejercicios.poo_anahi.domain.Formater
import Ejercicios.poo_anahi.domain.usc.GetFlightUsc
import Ejercicios.poo_anahi.presentation.flight.FlightConsole
import Ejercicios.poo_anahi.presentation.flight.FlightIngles
import Ejercicios.poo_anahi.presentation.tikect.TikectConsole
import java.math.BigDecimal
import java.time.LocalDateTime

fun main() {

    val getFlightUsc = GetFlightUsc(FlightIngles())
    print(getFlightUsc.invoke())


}

