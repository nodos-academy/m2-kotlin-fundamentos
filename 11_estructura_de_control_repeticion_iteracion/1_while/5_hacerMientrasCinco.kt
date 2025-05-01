// Algoritmo que utiliza un ciclo do-while para mostrar los valores de una variable desde 1 hasta 5
// En cada iteración imprime el valor actual y luego lo incrementa
// El ciclo se repite hasta que la variable sea mayor que 5

fun main() {
    var variable = 1
    println("Valor inicial de la variable: $variable\n")

    do {
        println("La variable contiene el dato: $variable")
        variable = variable + 1
    } while (variable <= 5)
}