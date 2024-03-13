package org.example

fun Ejercicio4() {
    val numeros = Array(4){0};
    var divisibles: Int = 0;
    var noDividisibles: Int = 0;

    for (i in 0 until  numeros.size){
        print("Ingrese el numero ${i+1}: ")
        numeros[i] = readLine()!!.toInt();
    }

    for (i in 0 until  numeros.size){
        if (numeros[i]%3 == 0){
            divisibles++
        }else{
            noDividisibles++
        }
    }

    println("Numeros Divisibles: $divisibles")
    println("Numeros no Divisibles: $noDividisibles")
}