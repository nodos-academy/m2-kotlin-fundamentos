// Programa que compara precios de dos productos usando operadores de comparación (==, !=, <, >, <=, >=)

fun main() {

    val precioProductoA = 50
    val precioProductoB = 75

    println("Precio del producto A: $precioProductoA")
    println("Precio del producto B: $precioProductoB\n")

    // Comparación de igualdad
    println("¿Son iguales? ${precioProductoA == precioProductoB}\n")  // == → true si los precios son iguales

    // Comparación de desigualdad
    println("¿Son diferentes? ${precioProductoA != precioProductoB}\n")  // != → true si son distintos

    // Producto A más barato que B
    println("¿A es más barato que B? ${precioProductoA < precioProductoB}\n")  // < → true si A < B

    // Producto A más caro que B
    println("¿A es más caro que B? ${precioProductoA > precioProductoB}\n")  // > → true si A > B

    // Producto A cuesta lo mismo o menos
    println("¿A cuesta lo mismo o menos que B? ${precioProductoA <= precioProductoB}\n")  // <=

    // Producto A cuesta lo mismo o más
    println("¿A cuesta lo mismo o más que B? ${precioProductoA >= precioProductoB}\n")  // >=
}