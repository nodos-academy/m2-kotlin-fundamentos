// Algoritmo que utiliza un ciclo mientras para mostrar los valores de una variable
// desde 0 hasta 5 (inclusive). En cada iteración, imprime el valor actual y lo incrementa en 1.

// Requerimiento (historia de usuario):
// Como: estudiante de programación que está explorando condiciones de parada
// Quiero: ver cómo funciona un ciclo que incluye el valor límite
// Para: entender la diferencia entre las condiciones < y <= en estructuras repetitivas

fun main() {
    var variable = 0
    println("Valor inicial de la variable: $variable\n")

    while (variable <= 5) {
        println("La variable contiene el dato: $variable")
        variable = variable + 1
    }
}