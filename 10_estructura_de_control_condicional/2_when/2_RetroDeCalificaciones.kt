// Algoritmo que solicita al usuario una calificación del 0 al 10
// Según la calificación ingresada, muestra un mensaje personalizado de retroalimentación
// Si el valor no está dentro del rango esperado, muestra un mensaje de error

fun main() {
    println("Ingresa tu calificación (0 - 10): ")
    val calif = readLine().toString().toDouble()
    println("\nTu calificación es: $calif")

    when (calif) {
        10.0 -> println("\nExcelente. ¡Sigue así!")
        in 9.0 ..< 10.0 -> println("\nMuy bien. Puedes llegar más lejos.")
        in 8.0 ..< 9.0 -> println("\nBien, pero hay espacio para mejorar.")
        in 7.0 ..< 8.0 -> println("\nJusto aprobaste!")
        in 6.0 ..< 7.0 -> println("\nCasi aprobabas, debes estudiar un poco más.")
        in 0.0..< 6.0 -> println("\nReprobado. No te rindas, ¡inténtalo de nuevo!")

        else -> println("\nCalificación inválida.")
    }
}