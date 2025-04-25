//Programa que solicita al usuario un número del 1 al 7 y muestra el día de la semana en el que desea viajar
//Si el número ingresado está fuera de ese rango, muestra un mensaje de error

fun main() {
    println("Indica un número correspondiente al día de la semana en que quieres viajar:")
    val dia = readLine().toString().toInt()

    if (dia == 1) {
        println("Decidiste viajar el Lunes")
    } else if (dia == 2) {
        println("Decidiste viajar el Martes")
    } else if (dia == 3) {
        println("Decidiste viajar el Miércoles")
    } else if (dia == 4) {
        println("Decidiste viajar el Jueves")
    } else if (dia == 5) {
        println("Decidiste viajar el Viernes")
    } else if (dia == 6) {
        println("Decidiste viajar el Sábado")
    } else if (dia == 7) {
        println("Decidiste viajar el Domingo")
    } else {
        println("Error, el número que escribió no es válido")
    }
}