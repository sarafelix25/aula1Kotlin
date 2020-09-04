package ExerciciosKotlinDH

fun main() {
    println("Os nomes são iguais?\n ${compararString("Laura", "Paula")}")
}

fun compararString (string1: String, string2: String): Boolean {
    return string1 == string2
}