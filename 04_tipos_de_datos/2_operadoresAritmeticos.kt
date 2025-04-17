// Programa que declara dos variables enteras y realiza operaciones matemáticas básicas:
// suma, resta, multiplicación, división y módulo. Imprime los resultados en consola usando distintas formas de salida.

fun main() {

    val a = 10
    val b = 3
	
    print("Suma: ")
    println(a + b)
    
    println("Resta: ${a - b}")
    
    val multiplicacion = a * b
    print("Multiplicación: ")
    println(multiplicacion)
	
    val division = a / b
    println("División: $division")    
    
    val modulo = a % b
    println("Módulo: $modulo")
}