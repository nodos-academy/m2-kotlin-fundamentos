//Programa que simula que solicita un número al usuario y evalúa si es positivo. Si lo es, muestra un mensaje indicándolo.

//Requerimiento (historia de usuario)
//Como: estudiante de matemáticas de nivel básico
//Quiero: ingresar un número y verificar si es positivo
//Para: estudiar e identificar los tipos de números

fun main() {
    println("Ingrese un número: ")
    val num = 1.0
    println("\nSu número es: $num")

    if (num > 0) {
        println("\nEl número es positivo")
    }
}