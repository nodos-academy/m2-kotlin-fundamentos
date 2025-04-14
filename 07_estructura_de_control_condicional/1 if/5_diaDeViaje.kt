//Programa que solicita al usuario un número del 1 al 7 y muestra el día de la semana en el que desea viajar.
//Si el número ingresado está fuera de ese rango, muestra un mensaje de error.

//Como: usuario de una app de planificación de viajes
//Quiero: que al seleccionar un número del 1 al 7, el sistema me diga qué día de la semana seleccioné
//Para: saber claramente en qué día estoy planeando mi viaje y evitar errores de planificación


fun main() {
    println("Indica un número correspondiente al día de la semana en que quieres viajar:")
    val dia = 3

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