// Algoritmo que utiliza un ciclo mientras para mostrar los valores de una variable
// desde 0 hasta 4. En cada iteración, imprime el valor actual y luego lo incrementa en 1.

// Requerimiento (historia de usuario):
// Como: estudiante de programación que quiere entender los bucles
// Quiero: visualizar cómo cambia el valor de una variable en un ciclo mientras
// Para: comprender el funcionamiento de las estructuras repetitivas

fun main() {
    var variable = 0
    println("Valor inicial de la variable: $variable\n")

    while (variable < 5) {
        println("La variable contiene el dato: $variable")
        variable = variable + 1
    }
}