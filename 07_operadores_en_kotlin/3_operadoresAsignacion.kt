//Programa que declara variables enteras relacionadas con el precio de una compra en línea, y aplica operaciones de asignación (-=, +=, *=, /=, %=)
//para simular descuentos, adición de productos, promociones y formas de pago. Cada operación actualiza el valor total y muestra el resultado en consola.


fun main() {

    var total = 100      // Precio base
    val descuento = 15   // Descuento en unidades monetarias
    val extra = 30       // Agregado por un producto adicional

    println("Precio inicial: $total\n")

    // Aplicar descuento
    total -= descuento   // total = total - descuento
    println("Después de aplicar descuento de $descuento: $total\n")

    // Agregar otro producto
    total += extra       // total = total + extra
    println("Después de agregar otro producto de $extra: $total\n")

    // Duplicar total por promoción de 2x1
    total *= 2           // total = total * 2
    println("Después de promoción 2x1 (x2): $total\n")

    // Dividir total entre 2 si se paga a medias con alguien
    total /= 2           // total = total / 2
    println("Pagando entre dos personas (÷2): $total\n")

    // Cálculo del resto si pagás con billetes de 7 unidades
    total %= 7           // total = total % 7
    println("Resto si pago con billetes de 7: $total\n")
}