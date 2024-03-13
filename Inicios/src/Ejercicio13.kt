fun Ejercicio13(){
    var nombre:String = ""
    var matricula:Float = 0f
    var promedio:Int = 0
    var descuento:Float = 0f

    println("Ingrese los nombres del estudiante:")
    print("nombre: ")
    nombre = readLine()!!.toString()
    print("Valor de la matricula: ")
    matricula = readLine()!!.toFloat()
    print("Promedio: ")
    promedio = readLine()!!.toInt()

    if (promedio>=0 && promedio<=500) {
        if (promedio < 420) {
            descuento = 0f
        } else if (promedio < 460) {
            descuento = matricula * 0.3f
        } else {
            descuento = matricula * 0.5f
        }
        println("El estudiante $nombre tienen derecho  un descuento de $descuento")
    }else{
        println("Valor fuera de rango")
    }
}