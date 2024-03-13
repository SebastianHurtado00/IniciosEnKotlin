fun Ejercicio19(){
    var minutos:Int = 0;

    print("Ingrese el numero de minutos que desea convertir: ")
    minutos = readLine()!!.toInt()
    val dias = minutos/(24*60)
    val horas = (minutos%(24*60))/60
    val minutosRestantes = (minutos % 60)

    println("$minutos minutos equivalen a $dias dias, $horas horas, $minutosRestantes minutos")
}