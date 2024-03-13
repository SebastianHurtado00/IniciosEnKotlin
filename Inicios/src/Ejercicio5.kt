fun Ejercicio5() {
    val notas = Array(6){0}
    var estudiantesAprobados = 0;
    var estudiantesReprobados = 0;

    for (i in 0 until  6){
        print("Ingrese la nota final del estudiante ${i+1}: ");
        notas[i] = readLine()!!.toInt()

        if (notas[i] >= 7){
            estudiantesAprobados++;
        }else{
            estudiantesReprobados++;
        }
    }

    println("Numero de Estudiantes Aprobados: $estudiantesAprobados")
    println("Numero de Estudiantes Reprobados: $estudiantesReprobados")
}