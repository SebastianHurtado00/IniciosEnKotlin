package org.example

fun Ejercicio3() {
    val numeros = Array(7){0};
    var positivos:Int = 0;
    var negativos:Int = 0;
    var positivosCount:Int = 0;
    var negativosCount:Int = 0;

    for (i in 0 until numeros.size){
        print("Ingrese el numero ${i + 1}: ") // Cambiado $i a ${i + 1}
        numeros[i] = readLine()!!.toInt()
        if(numeros[i] > 0){
            positivos++;
            positivosCount+=numeros[i];
        } else if (numeros[i] < 0) {
            negativos++;
            negativosCount+=numeros[i];
        }else{
            null
        }
    }

    println(positivos)
    println(negativos)
    println(positivosCount)
    println(negativosCount)
}