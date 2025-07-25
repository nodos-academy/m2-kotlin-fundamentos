//Programa que solicita al usuario un número del 1 al 7 y muestra el día de la semana en el que desea viajar
//Si el número ingresado está fuera de ese rango, muestra un mensaje de error

fun main() {
    println("Indica un número correspondiente al día de la semana en que quieres viajar:")
    val dia = readLine().toString().toInt()
    println("\nNúmero ingresado: $dia\n")

    when (dia) {
        1 -> println("Decidiste viajar el Lunes")
        2 -> println("Decidiste viajar el Martes")
        3 -> println("Decidiste viajar el Miércoles")
        4 -> println("Decidiste viajar el Jueves")
        5 -> println("Decidiste viajar el Viernes")
        6 -> println("Decidiste viajar el Sábado")
        7 -> println("Decidiste viajar el Domingo")
        else -> println("Error, el número que escribió no es válido")
    }
}