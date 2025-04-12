// Algoritmo que solicita la edad de una persona y determina si es mayor de edad.
// Imprime un mensaje indicando si tiene 18 años o más, o si no los tiene.

// Requerimiento (historia de usuario):
// Como: operador del Instituto Nacional Electoral
// Quiero: ingresar la edad de un ciudadano para saber si es o no mayor de edad
// Para: determinar si ya se le puede entregar su ID / credencial

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