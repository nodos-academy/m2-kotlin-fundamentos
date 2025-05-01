// Algoritmo que solicita al usuario un número inicial, un número tope y un tamaño de paso
// Luego, utiliza un ciclo for con incremento personalizado para generar una secuencia
// Si el número inicial es mayor que el tope, muestra un mensaje de advertencia

fun main() {
    println("Indica un número tope:")
    val veces = readLine().toString().toInt()

    println("\nIndica un número inicial:")
    val contadorInicial = readLine().toString().toInt()

    println("\nIndica con cuánto se incrementará en cada repetición:")
    val paso = readLine().toString().toInt()

    println("\nValor del tope: $veces")
    println("Valor inicial del contador: $contadorInicial")
    println("Tamaño del paso: $paso\n")

    if (contadorInicial <= veces) {
        for (contador in contadorInicial..veces step paso) {
            println("La variable contiene el dato: $contador")
        }
    } else {
        println("Para que el algoritmo funcione, el número de inicio debería ser menor o igual que el número tope")
    }
}