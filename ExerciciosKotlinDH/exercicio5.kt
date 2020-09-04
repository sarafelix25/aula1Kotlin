package ExerciciosKotlinDH

fun main() {
    println(analisarNumeros(1, 1, 5, 5))
}

fun analisarNumeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return if (numA > numC && numA > numD) {
        numA > numC && numA > numD
    } else if (numB > numC && numB > numD) {
        numB > numC && numB > numD
    } else {

        false

    }
}