package org.example

fun main(){
    val numeros = Array(3){Array(3){0} }
    var suma:Int = 0
    var numeroMenor:Int = 99999999
    var numeroMayor:Int = 0

    println("Ingrese los numeros:")
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            numeros[i][j] = readLine()!!.toInt()
        }
    }

    println("Diagonal principal:")
    for (i in 0 until 3){
        for (j in 0 until  3){
            if (i == j){
                print("${numeros[i][j]}  ")
                suma+=numeros[i][j]
                if (numeroMenor>numeros[i][j]){
                    numeroMenor = numeros[i][j]
                }
                if (numeroMayor<numeros[i][j]){
                    numeroMayor = numeros[i][j]
                }
            }else{
                print("*  ")
            }
        }
        println()
    }

    println("Suma de la diagonal: $suma")
    println("Numero menor de la diagonal: $numeroMenor")
    println("Numero mayor de la diagonal: $numeroMayor")
}