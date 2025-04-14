// Algoritmo que solicita la edad de una persona y determina si es mayor de edad.
// Imprime un mensaje indicando si tiene 18 años o más, o si no los tiene.

fun main() {
    println("Indique su edad: ")
    val edad = 17.0
    println("\nLa edad ingresada es: $edad")

    if (edad >= 18.0) {
        println("\nEs mayor de edad")
    } else {
        println("\nNo es mayor de edad")
    }
}