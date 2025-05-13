// Programa que solicita un número al usuario y muestra si es positivo, negativo o cero.

fun main() {
    println("Ingresa un número:")
    val numero = readLine().toString().toDouble()

    if (numero > 0) {
        println("El número: $numero es positivo.")
    } else if (numero < 0) {
        println("El número: $numero es negativo.")
    } else {
        if (numero == 0.0) {
        	println("El número: $numero, es cero.")
        }
    }
}