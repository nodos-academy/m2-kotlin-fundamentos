
//Función main
fun main() {
    saludar()
    saludarPersona("Ana")
    val resultado = obtenerSuma(3, 5)
    println("La suma es: $resultado")
    println("La longitud de la palabra 'elefante' es: ${longitudTexto("elefante")}")
}

// Función sin parámetros ni retorno
fun saludar() {
    println("Hola desde una función sin parámetros")
}

// Función con parámetro, sin retorno
fun saludarPersona(nombre: String) {
    println("Hola, $nombre")
}

// Función con parámetros y retorno
fun obtenerSuma(a: Int, b: Int): Int {
    return a + b
}

// Función con un parámetro y retorno
fun longitudTexto(texto: String): Int {
    return texto.length
}