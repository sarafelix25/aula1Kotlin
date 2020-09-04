package ExerciciosKotlinDH

fun main() {
    println(cemPrimeirosPositivos())
}

fun cemPrimeirosPositivos(): ArrayList<Int> {
    val listaPositivos = arrayListOf<Int>()

    for (i in 1 .. 100) {
        listaPositivos.add(i)
    }

    return listaPositivos
}