// Programa que muestra cómo funcionan los operadores de incremento y decremento (++ y --).
// Cada operación modifica el valor de una variable y muestra el resultado en consola.

fun main() {

    var x = 10
    println("Valor inicial: $x\n")

    x++  // x = x + 1
    println("Después de x++ (incremento): $x\n")

    --x  // x = x - 1
    println("Después de --x (decremento): $x\n")
}