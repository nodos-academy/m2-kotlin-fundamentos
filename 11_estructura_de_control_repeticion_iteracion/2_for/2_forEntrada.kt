// Algoritmo que solicita al usuario un número inicial y un número tope.
// Luego, utiliza un ciclo Para que inicia desde el número ingresado y finaliza en el tope,
// mostrando en pantalla cada valor en ese rango con incrementos de uno.

fun main() {
    println("Indica un número tope:")
    val veces = readLine().toString().toInt()

    println("\nIndica un número inicial:")
    val contadorInicial = readLine().toString().toInt()

    println("Valor del tope: $veces")
    println("Valor inicial del contador: $contadorInicial\n")

    for (contador in contadorInicial..veces) {
        println("La variable contiene el dato: $contador")
    }
}