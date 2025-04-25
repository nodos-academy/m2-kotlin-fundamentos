//Programa que solicita un número al usuario y evalúa tres condiciones:
// si es positivo, si es par, y si es mayor que diez. Imprime un mensaje por cada condición que se cumpla.

fun main() {
    println("Ingrese un número: ")
    val num = readLine().toString().toDouble()
    println("\nSu número es: $num")

    if (num > 0) {
        println("\nEl número es positivo")
    }

    if (num % 2 == 0.0) {
        println("\nEl número es par")
    }

    if (num > 10) {
        println("\nEl número es mayor a diez")
    }
}