fun Ejercicio17(){
    var valorHora:Double = 0.0
    var numeroHoras:Int = 0
    var sueldo:Double = 0.0

    println("Ingresa los Datos del Trabajador")
    print("Valor por hora: ")
    valorHora = readLine()!!.toDouble()
    print("Numero de horas: ")
    numeroHoras = readLine()!!.toInt()

    if (numeroHoras > 0) {
        if (numeroHoras <= 40) {
            sueldo = valorHora * numeroHoras
        } else {
            sueldo = (valorHora * 40.0) + (valorHora * (numeroHoras - 40)) * 1.5
        }
    }else{
        println("Datos erroneos")
    }

    println("El sueldo del trabajador sera de: $sueldo")
}