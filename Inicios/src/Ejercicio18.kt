fun Ejercicio18(){
    var sueldo:Double = 0.0

    println("Ingrese los datos del trajador")
    print("Sueldo Base: ")
    sueldo = readLine()!!.toDouble()

    if(sueldo>0){
        if (sueldo < 1000){
            sueldo-=(sueldo*0.1)
        }else if(sueldo <2000){
            sueldo-=(sueldo*0.05)
        }else{
            sueldo-=(sueldo*0.03)
        }
        println("El sueldo neto del trabajador es: $sueldo")
    }else{
        print("Datos Erroneos")
    }
}