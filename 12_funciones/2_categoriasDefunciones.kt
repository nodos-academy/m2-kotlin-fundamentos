// Importación de funciones de utilidad de la librería estándar

import kotlin.math.sqrt            // Función matemática: raíz cuadrada

import kotlin.math.pow             // Función matemática: potencia

import kotlin.random.Random        // Clase de números aleatorios

import kotlin.text.isEmpty         // Función para verificar cadenas vacías
                                    // No se necesita importar porque es una función miembro de String, no una función de utilidad externa

import kotlin.collections.maxOrNull // Función para obtener el valor máximo de una lista

fun main() {
    // 1. Número aleatorio entre 1 y 10
    // Categoría: Función miembro de objeto (Random.nextInt)
    val aleatorio = Random.nextInt(1, 11)
    println("1. Número aleatorio entre 1 y 10: $aleatorio")

    // 2. Calcular la raíz cuadrada de 25.0
    // Categoría: Función top-level (sqrt)
    val raiz = sqrt(25.0)
    println("2. Raíz cuadrada de 25: $raiz")

    // 3. Elevar 2 a la potencia 3 (2^3)
    // Categoría: Función top-level (pow)
    val potencia = 2.0.pow(3)
    println("3. 2 elevado a la 3 es: $potencia")

    // 4. Verificar si una cadena está vacía
    // Categoría: Función miembro de clase (String.isEmpty)
    val texto = "hola"
    println("4. ¿El texto está vacío?: ${texto.isEmpty()}")

    // 5. Obtener el número máximo de una lista
    // Categoría: Función de extensión (maxOrNull)
    val numeros = listOf(3, 7, 2, 9, 5)
    val maximo = numeros.maxOrNull()
    println("5. El número más grande de la lista es: $maximo")

    // 6. Invertir una cadena usando reversed()
    // Categoría: Función de extensión (reversed)
    val original = "Kotlin"
    val invertida = original.reversed()
    println("6. Cadena original: $original")
    println("   Cadena invertida: $invertida")
}