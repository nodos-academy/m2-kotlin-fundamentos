import kotlin.random.Random

fun main() {

    // Instrucciones
    println("🎲 Bienvenido al juego del 'Dado'\n")
    println("Elige un número del 1 al 6:")

    // Leer opción del jugador
    val eleccionJugador = readLine()?.toInt()

    if (eleccionJugador !in 1..6) {
        println("❌ Entrada inválida. Debes elegir un número del 1 al 6.\n\n\n\n\n\n\n\n\n\n\n\n")
        //return
    }

    println("Tu elección fue: $eleccionJugador")

    // Lanzar dado aleatorio: números del 1 al 6
    val resultadoDado = Random.nextInt(1, 7)

    // Mostrar resultado
    println("\nEl dado cayó en: $resultadoDado\n")

    // Verificar si el jugador ganó
    if (eleccionJugador == resultadoDado) {
        println("🎉 ¡Ganaste!")
    } else {
        println("😢 Perdiste. ¡Suerte para la próxima!")
    }
}
