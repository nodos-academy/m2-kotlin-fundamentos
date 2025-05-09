// Algoritmo que simula el juego "Cara o Cruz"
// El usuario elige entre cara o cruz, se lanza una moneda de forma aleatoria,
// y se muestra si el usuario adivinó correctamente o no

import kotlin.random.Random

fun main() {

    // Instrucciones
    println("🎮 Bienvenido al juego de 'Cara o Cruz'\n")
    println("Escribe tu elección (cara o cruz):\n")

    // Leer opción del jugador
    val eleccionJugador = readLine().toString()
    println("Tu elección fue: $eleccionJugador")

    // Lanzar moneda aleatoria: 0 = cara, 1 = cruz
    val resultadoMoneda = if (Random.nextInt(2) == 0) "cara" else "cruz"

    // Mostrar resultado
    println("\nLa moneda cayó en: $resultadoMoneda\n")

    // Verificar si el jugador ganó
    if (eleccionJugador == resultadoMoneda) {
        println("🎉 ¡Ganaste!")
    } else {
        println("😢 Perdiste. ¡Suerte para la próxima!")
    }
}