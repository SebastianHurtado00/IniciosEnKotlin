fun Ejercicio20(){
    var numeros = Array(3){0}

    println("Ingrese 3 numeros: ")
    for (i in 0 until numeros.size){
        numeros[i] = readLine()!!.toInt()
    }

    val multiplicacion = numeros.reduce{acc: Int, i: Int ->  acc * i }
    val suma = numeros.sum()

    println("La suma es: " + suma)
    println("La multiplicacion es: " + multiplicacion)
}
