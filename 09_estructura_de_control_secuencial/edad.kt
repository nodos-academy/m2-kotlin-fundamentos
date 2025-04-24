// Programa que solicita el año de nacimiento del usuario, calcula su edad actual y muestra el resultado en consola.

// Como: usuario curioso sobre su edad actual
// Quiero: ingresar mi año de nacimiento
// Para: saber cuántos años tengo en este momento

fun main() {

    val anioActual = 2025

    println("📅 Calculadora de Edad")
    println("Por favor, ingresa tu año de nacimiento:")

    val anioNacimiento = 1999 // readln().toInt()

    val edad = anioActual - anioNacimiento

    println("Tienes $edad años.")
}