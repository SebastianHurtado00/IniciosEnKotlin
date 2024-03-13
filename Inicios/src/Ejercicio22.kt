fun Ejercicio22(){
    var numero:Int = 0

    print("Ingrese un numero: ")
    numero = readLine()!!.toInt()

    parImpar(numero)
    isPrimo(numero)
}

fun parImpar(numero:Int){
    if (numero%2 == 0){
        println("El numero $numero es Par")
    }else{
        println("El numero $numero es Impar")
    }
}

fun isPrimo(numero: Int){
    var counter:Int = 0

    for (i in 1..numero ){
        if (numero%i == 0){
            counter++
        }
    }

    if (counter==2){
        println("El numero $numero es primo")
    }else{
        println("El numero $numero no es primo")
    }
}