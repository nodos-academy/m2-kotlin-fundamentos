// Algoritmo que solicita al usuario un número entero como valor inicial
// Luego, utiliza un ciclo mientras para mostrar los valores de esa variable
// desde el número ingresado hasta 5 (inclusive). En cada iteración, imprime el valor y lo incrementa en 1


fun main() {

    println("Ingresa un número entero:")
    var variable = readLine().toString().toInt()

    println("Valor inicial de la variable: $variable\n")

    println("Ciclo:")
    while (variable <= 5) {
        println("La variable contiene el dato: $variable")
        variable = variable + 1
    }
}