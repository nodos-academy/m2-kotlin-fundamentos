// Algoritmo que utiliza un ciclo mientras para mostrar los valores de una variable
// desde 0 hasta 4. En cada iteración, imprime el valor actual y luego lo incrementa en 1.

fun main() {
    var variable = 0// Algoritmo que utiliza un ciclo mientras para mostrar los valores de una variable

    println("Valor inicial de la variable: $variable\n")

    while (variable < 5) {
        println("La variable contiene el dato: $variable")
        variable = variable + 1
    }
}

//@Noder: Actualiza este código para que el dato en que iniciará la cuenta