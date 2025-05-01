// Algoritmo que solicita al usuario un número de inicio y un número tope
// Luego, usa un ciclo mientras para mostrar los valores desde el número inicial hasta el tope (inclusive)

fun main() {
    println("Ingresa un número como tope para este ciclo:")
    val tope = readLine().toString().toInt()

    println("Ingresa un número como valor incial:")
    var contador = readLine().toString().toInt()

    println("\nValor del tope: $tope")
    println("Valor inicial del contador: $contador\n")

    while (contador <= tope) {
        println("La variable contiene el dato: $contador")
        contador = contador + 1
    }
}