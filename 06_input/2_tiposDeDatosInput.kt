// Programa interactivo que solicita al usuario datos de distintos tipos básicos en Kotlin y muestra cómo se almacenan.

fun main() {
    println("¡Hola! Soy un programa interactivo que te ayudará a practicar los tipos de datos más comunes en Kotlin.")
    println("A continuación, te pediré que ingreses valores de distintos tipos para que puedas ver cómo se almacenan y utilizan.\n")

    // Int
    println("Ingresa un número entero: ")
    val entero: Int = readLine().toString().toInt()
    println("Ingresaste el dato: $entero\n")

    // Double
    println("Ingresa un número decimal (Double): ")
    val doblePrecision: Double = readLine().toString().toDouble()
    println("Ingresaste el dato: $doblePrecision\n")

    // Float
    println("Ingresa un número decimal (Float): ")
    val flotante: Float = readLine().toString().toFloat()
    println("Ingresaste el dato: $flotante\n")

    // Char
    println("Ingresa un carácter: ")
    val caracter: Char = readLine().toString()[0]
    println("Ingresaste el dato: $caracter\n")

    // String
    println("Ingresa una cadena de texto: ")
    val cadenaDeTexto: String = readLine().toString()
    println("Ingresaste el dato: $cadenaDeTexto\n")

    // Boolean
    println("Ingresa un valor booleano (true / false): ")
    val booleano: Boolean = readLine().toString().toBoolean()
    println("Ingresaste el dato: $booleano\n")
}