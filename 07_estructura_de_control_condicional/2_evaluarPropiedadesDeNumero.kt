//Programa que simula que solicita un número al usuario y evalúa tres condiciones:
// si es positivo, si es par, y si es mayor que diez. Imprime un mensaje por cada condición que se cumpla.

// Requerimiento (historia de usuario):
// Como: estudiante de matemáticas que está aprendiendo sobre propiedades numéricas
// Quiero: ingresar un número y conocer si es positivo, par y mayor que diez
// Para: estudiar los diferentes atributos que puede tener un número dado

fun main() {
    println("Ingrese un número: ")
    val num = 12.0
    println("\nSu número es: $num")

    if (num > 0) {
        println("\nEl número es positivo")
    }

    if (num % 2 == 0) {
        println("\nEl número es par")
    }

    if (num > 10) {
        println("\nEl número es mayor a diez")
    }
}