fun Ejercicio6(){
    val notas = Array(6){0};
    var notaBaja:Int = 0;
    var notaPromedio:Int = 0;
    var notaAlta:Int = 0;

    for (i in 0 until notas.size){
        print("Ingrese la nota del estudiante ${i+1}: ")
        notas[i] = readLine()!!.toInt()

        if (notas[i]>=0 && notas[i]<=500){
            if (notas[i]<=200){
                notaBaja++
            }else if (notas[i]<=400){
                notaPromedio++
            }else{
                notaAlta++
            }
        }else{
            null
        }
    }

    println("Numero de estudiantes con nota baja: $notaBaja")
    println("Numero de estudiantes con nota promedio: $notaPromedio")
    println("Numero de estudiantes con nota Alta: $notaAlta")
}