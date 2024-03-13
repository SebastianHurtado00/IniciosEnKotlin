fun Ejercicio11(){
    var numeros = Array(5){0}
    var numeroMayor = 0
    var numeroMenor = 0

    for (i in 0 until numeros.size){
        print("Ingrese el numero ${i+1}: ")
        numeros[i] = readLine()!!.toInt()
    }

    numeroMayor = numeros.maxOrNull()!!
    numeroMenor = numeros.minOrNull()!!

    println("El numero mayor es: $numeroMayor")
    println("EL numero menor es: $numeroMenor")
}