// Algoritmo que solicita al usuario una calificación del 0 al 10.
// Según la calificación ingresada, muestra un mensaje personalizado de retroalimentación.
// Si el valor no está dentro del rango esperado, muestra un mensaje de error.

// Requerimiento (historia de usuario):
// Como: estudiante que consulta su calificación en una app educativa
// Quiero: ingresar mi calificación y recibir un mensaje que refleje mi desempeño
// Para: motivarme y entender cómo voy en mi proceso académico





























fun main() {
    println("Ingresa tu calificación (0 - 10): ")
    val calif = 10.1
    println("\nTu calificación es: $calif")

    when (calif.toInt()) {
        10 -> println("\nExcelente. ¡Sigue así!")
        9 -> println("\nMuy bien. Puedes llegar más lejos.")
        8 -> println("\nBien, pero hay espacio para mejorar.")
        7 -> println("\nJusto aprobaste!")
        6 -> println("\nCasi aprobabas, debes estudiar un poco más.")
        in 0..5 -> println("\nReprobado. No te rindas, ¡inténtalo de nuevo!")
        else -> println("\nCalificación inválida.")
    }
}










