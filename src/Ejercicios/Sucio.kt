package Ejercicios

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer
import javax.swing.JOptionPane

fun main() {

    val cancion = Song("javier","la reina mora")
    val cancion1 = Song("sonia","la reina mora")
    val cancion2 = Song("sandra","la reina mora")
    cancion.play()
    cancion.stop()
    cancion1.play()
    cancion2.play()
}

class Song(
    val tittle: String,
    val artista: String
){
    private val mayusculas = tittle.uppercase()
    init {
        println("OBJETO EN INIT y mirando el valor de mysculas: $mayusculas")
    }
    fun play(){
        println("LA CANCIÓN ESTA SONANDO")
        println("Artista: $artista")
        println("TITULO: $mayusculas")
    }
    fun stop(){
        println("LA CANCIÓN ESTA EN STOP")
        println("Artista: $artista")
        println("TITULO: $mayusculas")
    }

}


