package ExerciciosKotlinDH

fun main() {
    imprimirCemImpares()
}

fun imprimirCemImpares() {
    for (num in 0 .. 100) {
        if (num % 2 != 0) {
            println(num)
        }
    }
}