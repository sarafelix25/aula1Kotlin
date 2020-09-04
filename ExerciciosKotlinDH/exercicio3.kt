package ExerciciosKotlinDH

fun main() {
    println("O número é par?\n ${numeroPar(2)}")
}

fun numeroPar(numero: Int): Boolean {
    return numero % 2 == 0
}