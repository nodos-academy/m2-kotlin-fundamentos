// Algoritmo que utiliza un ciclo for para mostrar los valores de una variable desde 0 hasta 5
// Incrementa de uno en uno e imprime el valor en cada iteración del ciclo

fun main() {
    println("Secuencia desde 0 hasta 5\n")

    for (variable in 0..5) {
        println("La variable contiene el dato: $variable")
    }
}