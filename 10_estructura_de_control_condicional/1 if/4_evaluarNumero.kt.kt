//Programa que evalúa un número y determina si es positivo, negativo o cero.

// Como: usuario de una aplicación educativa o calculadora digital
// Quiero: ingresar un número y que el sistema me indique si es positivo, negativo o cero
// Para: obtener una evaluación clara del valor numérico ingresado y comprender mejor su clasificación

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