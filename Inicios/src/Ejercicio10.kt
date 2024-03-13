fun Ejercicio10(){
    var sueldo:Float = 0f
    var numeroHijos:Int = 0
    var grado:Int = 0
    var antiguedad:Int = 0
    var auxilio:Float = 0f

    println("Ingrese los datos del trabajador")
    print("Suelo: ")
    sueldo = readLine()!!.toFloat()
    print("Numero de Hijos: ")
    numeroHijos = readLine()!!.toInt()
    print("Grado: ")
    grado = readLine()!!.toInt()
    print("Años de Antiguedad: ")
    antiguedad = readLine()!!.toInt()

    if(numeroHijos<4 && grado>5){
        auxilio = sueldo * 0.1f
    }else if(antiguedad<=3 && sueldo < 1000000f){
        auxilio = sueldo * 0.05f
    }else{
        auxilio = sueldo * 0.07f
    }

    println("El trabajador tiene derecho a un auxilio de $auxilio")
}