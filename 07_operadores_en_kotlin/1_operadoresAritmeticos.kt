// Programa que solicita dos variables Double y realiza operaciones matemáticas básicas:
// suma, resta, multiplicación, división y módulo. Imprime los resultados en consola usando distintas formas de salida.

fun main() {

    println("Ingresa el primer número decimal: ")
    val a = readLine().toString().toDouble()

    println("Ingresa el segundo número decimal: ")
    val b = readLine().toString().toDouble()
	
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