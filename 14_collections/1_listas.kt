


fun main() {
    //Declarando una lista
    var personas: MutableList<String> = mutableListOf<String>()

    //Leyendo lista vacía
    println(personas)

    //Creando elementos en la lista
    personas.add("Alejandra")

    //Leyendo lista
    println(personas)

    //Creando más elementos
    personas.add("Benjamín")
    personas.add("Camila")
    personas.add("Diego")
    personas.add("Edna")

    //Leyendo lista desde función
    leerLista(personas)

    //Eliminando elementos
    personas.removeAt(1)

    //Leyendo lista
    leerLista(personas)

    //Actualizando elementos
    personas.set(3, "Eduardo")

    //Leyendo lista
    leerLista(personas)

    //Usando función de acceso
    println(personas.first())

    //Usando get(n)
    println(personas.get(1))

    //Usando operador lista[n]
    println(personas[2])

    //Usando otra función de acceso
    println(personas.last())
    println()

    //Leyendo con for
    for (person in personas) //Cuando solamente incluye una línea, no son obligatorias las { }
        println(person)
    println()

    //Leyendo con forEach
    personas.forEach { p ->  println(p)}
    println()

    //Leyendo de otra manera con forEach
    personas.forEach {
        println(it)
    }

    println("\nLa persona en el lugar 2 es: ${personas[2]}")
    println("El número de caracteres del nombre es: ")
    print(personas[2].length)

    println("\n\n¿La lista está vacía? ${personas.none()}")


    val miColeccionDeNumeros: List<Int> = listOf(1, 1, 2, 3, 5, 8, 13)
    val res = miColeccionDeNumeros.filter { it >= 4 }
    println("Números mayores o iguales que 4: $res")
    //miColeccion.add(9)

    println(miColeccionDeNumeros.reversed())
}

fun leerLista(l: MutableList<String>) {
    println(l)
}