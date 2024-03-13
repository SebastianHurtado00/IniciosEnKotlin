fun Ejercicio16(){
    var volumen:Double = 0.0
    val pi:Double = 3.1416
    var radio:Double = 0.0
    var altura:Double = 0.0

    println("Ingrese Los valores Necesarios:")
    print("Altura: ")
    altura = readLine()!!.toDouble()
    print("Radio: ")
    radio = readLine()!!.toDouble()

    volumen = pi * altura * Math.pow(radio,2.0)

    println("El volumen del cilindro es: $volumen unidades cubicas")
}