fun Ejercicio15(){
    var edades = Array(3){0}
    var valor = 0

    for (i in 0 until edades.size){
        print("Ingrese la edad numero ${i+1}: ")
        edades[i] = readLine()!!.toInt()
    }

    if (edades.sum()%2 ==0){
        for (i in 0 until edades.size){
            valor+=(edades[i] * edades[i])
        }
    }else{
        for (i in 0 until edades.size){
            valor+=(edades[i] * edades[i] * edades[i])
        }
    }

    println("El valor es: $valor")
}