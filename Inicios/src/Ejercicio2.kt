package org.example

fun Ejercicio2() {
    val numeros = Array(5) { 0 }
    var positivos = 0
    var negativos = 0

    for (i in 0 until numeros.size) {
        println("Ingrese el numero: ${i + 1}")
        numeros[i] = readLine()!!.toInt()
        if (numeros[i] > 0) {
            positivos++
        } else if (numeros[i] < 0) {
            negativos++
        }
    }

    println("Números positivos: $positivos")
    println("Números negativos: $negativos")
}
