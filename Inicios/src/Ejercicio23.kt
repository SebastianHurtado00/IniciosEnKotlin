fun Ejercicio23(){
    val numeros = Array(10){0}

    println("Ingrese 10 numeros:")
    for (i in 0 until numeros.size){
        numeros[i] = readLine()!!.toInt()
    }

    for (i in 0 until numeros.size){
        print("${numeros[i]} ")
    }

    println("")
    println("Suma: " + numeros.sum())
    println("Numero Menor: " + numeros.minOrNull())
    println("Numero Mayor: " + numeros.maxOrNull())
}