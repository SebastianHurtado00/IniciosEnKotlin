fun Ejercicio24(){
    val numeros = Array(16){0}

    println("Ingrese los 16 numeros de la matriz: ")
    for (i in 0 until numeros.size){
        numeros[i] = readLine()!!.toInt()
    }

    for (i in 0 until numeros.size){
        print("${numeros[i]} ")
        if (i == 3 || i == 7 || i ==11){
            println()
        }
    }

    println()

    println("La suma de los datos es: " + numeros.sum())
    println("EL numero mayor es: " + numeros.maxOrNull())
    println("El numero menor es: " + numeros.minOrNull())
}