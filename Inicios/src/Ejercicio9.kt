fun Ejercicio9(){
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

    if (numeroHijos>=5 || antiguedad>=8){
        auxilio = 100000f * numeroHijos;
    }else{
        auxilio = sueldo * 2;
    }

    println("El trabajador Tiene derecho a un auxilio de $auxilio")
}