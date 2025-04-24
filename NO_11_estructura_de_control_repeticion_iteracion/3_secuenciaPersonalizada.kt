// Algoritmo que solicita al usuario un número de inicio y un número tope.
// Luego, usa un ciclo mientras para mostrar los valores desde el número inicial hasta el tope (inclusive).

// Requerimiento (historia de usuario):
// Como: usuario de una app educativa para practicar secuencias numéricas
// Quiero: ingresar un número inicial y un número final para generar una secuencia
// Para: visualizar de forma ordenada los valores entre esos dos puntos

fun main() {
    val tope = 8
    var contador = 4

    println("Valor del tope: $tope")
    println("Valor inicial del contador: $contador\n")

    while (contador <= tope) {
        println("La variable contiene el dato: $contador")
        contador = contador + 1
    }
}