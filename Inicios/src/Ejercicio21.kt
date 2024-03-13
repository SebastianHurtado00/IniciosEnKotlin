fun Ejercicio21(){
    val numeros = Array(5){0.0}
    var promedio:Double = 0.0
    var notaMayor:Double = 0.0
    var notaMenor:Double = 0.0

    println("Ingrese 5 numeros: ")

    for (i in 0 until numeros.size){
        numeros[i] = readLine()!!.toDouble()
    }

    promedio = numeros.average()
    notaMayor = numeros.maxOrNull()!!
    notaMenor = numeros.minOrNull()!!

    println("Promedio: $promedio")
    println("Nota Mayor: $notaMayor")
    println("Nota menor: $notaMenor")
}