fun Ejercicio12(){
    val dias = arrayOf("Lunes","Martes","Miercoles","Juevez","Viernes","Sabado","Domingo")

    print("Ingrese un numero del 1 al 7: ")
    var num = readLine()!!.toInt()

    if(num>=1 && num<=7) {
        for (i in 0 until dias.size) {
            if (i == num - 1) {
                println("El dia es: ${dias[i]}")
            } else {
                null
            }
        }
    }else{
        println("El dia no existe")
    }
}