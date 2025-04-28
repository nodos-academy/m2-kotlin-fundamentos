// Programa que simula una compra en línea aplicando operaciones de asignación compuesta += -= /= %=
// para mostrar cómo varía el total según descuentos productos adicionales división del pago y cálculo de resto
// cada operación modifica el valor del total y muestra el resultado en consola

fun main() {

    println("Ingrese el total de la compra:")
    var total: Double = readLine().toString().toDouble()  // Precio base (var)
    val descuento: Double = 5.0   // Cantidad a descontar en unidades monetarias
    val extra: Double = 30.0       // Agregado por un producto adicional

    println("Precio inicial: $total\n")

    // Descontar por cliente frecuente
    total -= descuento   // total = total - descuento
    println("Después de descontar: $descuento, ud. pagará: $total\n")

    // Agregar otro producto
    total += extra       // total = total + extra
    println("Después de agregar otro producto de $extra: $total\n")

    // Dividir total entre 2 si se paga a medias con alguien
    total /= 2           // total = total / 2
    println("Pagando entre dos personas (÷2): $total\n")

    // Cálculo del resto si pagás con billetes de 7 unidades
    total %= 7           // total = total % 7
    println("Resto si una persona paga con billetes de 7: $total\n")
    //no calcula el cambio, sino el resto de lo que el cliente tiene que pagar en monedas
}