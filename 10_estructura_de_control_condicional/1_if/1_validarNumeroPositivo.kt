// Programa que solicita un número al usuario y evalúa si es positivo si lo es muestra un mensaje indicándolo

fun main() {
    println("Ingrese un número: ")
    val num = readLine().toString().toDouble()
    println("\nSu número es: $num")

    if (num > 0) {
        println("\nEl número es positivo")
    }
}