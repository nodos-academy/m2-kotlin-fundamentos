// Programa que solicita el año de nacimiento del usuario calcula su edad actual y muestra el resultado en consola

fun main() {

    println("Indique qué año es actualmente:")
    val anioActual = readLine().toString().toInt()

    println("📅 Calculadora de Edad")
    println("Por favor, ingresa tu año de nacimiento:")

    val anioNacimiento = readln().toInt()

    val edad = anioActual - anioNacimiento

    println("En el año $anioActual, cumplirás $edad años.")
    println("(independientemente al día y mes de hoy)")
}