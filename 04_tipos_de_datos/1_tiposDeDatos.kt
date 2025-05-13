// Programa que explica y ejemplifica los tipos de datos más comunes en Kotlin.

fun main() {
    println("Hola, soy un programa que te ayuda a identificar los tipos de datos más comunes que de Kotlin\n")
    
    println("TIPO Int")
    println("Permite almacenar datos numéricos de -2,147,483,648 a 2,147,483,647")
    println("Ejemplo: Puede usarse para opciones numéricas de un menú")
    val entero: Int = 10
    println("La variable: 'entero'")
    println("Almacena el dato: $entero\n")
    
    println("TIPO Double")
    println("Permite almacenar números con decimales de doble precisión (más exactos)")
    println("Ejemplo: Puede usarse para representar el peso de un objeto")
    val doblePrecision: Double = 67.5
    println("La variable: 'doblePrecision'")
    println("Almacena el dato: $doblePrecision\n")

    println("TIPO Float")
    println("Permite almacenar números con decimales de menor precisión que Double")
    println("Ejemplo: Puede usarse para representar la temperatura corporal")
    val flotante: Float = 36.6f
    println("La variable: 'flotante'")
    println("Almacena el dato: $flotante\n")


    //Siguiente clase
    println("TIPO Char")
    println("Permite almacenar un solo carácter")
    println("Ejemplo: Puede usarse para guardar el género de una persona (M / H)")
    val caracter: Char = 'H'
    println("La variable: 'caracter'")
    println("Almacena el dato: $caracter\n")

    println("TIPO String")
    println("Permite almacenar cadenas de texto")
    println("Ejemplo: Puede usarse para nombres, mensajes o frases")
    val cadenaDeTexto: String = "Hola"
    println("La variable: 'cadenaDeTexto'")
    println("Almacena el dato: $cadenaDeTexto\n")

    println("TIPO Boolean")
    println("Permite almacenar valores lógicos: true o false")
    println("Ejemplo: Puede usarse para verificar si un usuario está activo o no")
    val booleano: Boolean = true
    println("La variable: 'booleano'")
    println("Almacena el dato: $booleano\n")
    
    
}