package org.example

fun Ejercicio1() {
    val numeros = Array(6) { 0 }
    var pares = 0
    var impares = 0

    for (i in 0 until numeros.size) {
        println("Ingrese el numero: ${i + 1}")
        numeros[i] = readLine()!!.toInt()
    }

    for (i in 0 until numeros.size) {
        if (numeros[i] % 2 == 0) {
            pares++
        } else {
            impares++
        }
    }

    println("pares: $pares")
    println("impares: $impares")
}
