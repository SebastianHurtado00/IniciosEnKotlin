package org.example

fun main(){
    val numeros = Array(9){0}
    llenarArray(numeros)
}

fun llenarArray(arreglo:Array<Int>){
    println("Ingrese 9 numeros: ")
    var numerosPares:Int = 0
    var numerosImpares:Int = 0
    var numerosNegativos:Int = 0
    var numerosPositivos:Int = 0

    for (i in 0 until arreglo.size){
        arreglo[i] = readLine()!!.toInt()

        if (arreglo[i]>0){
            numerosPositivos++
        }else{
            numerosNegativos++
        }

        if(arreglo[i]%2 == 0){
            numerosPares++
        }else{
            numerosImpares++
        }
    }

    println("Numeros pares: $numerosPares")
    println("Numeros Impares: $numerosImpares")
    println("Numeros Positivos: $numerosPositivos")
    println("Numeros Negativos: $numerosNegativos ")
}
