import kotlin.math.roundToInt

fun Ejercicio8(){
    var nombre:String = ""
    var numeroVentas:Int = 0
    var sueldo:Float = 0f
    var bonificacion:Float = 0f

    println("Ingrese los datos del trabajador")
    print("nombre: ")
    nombre = readLine()!!.toString()
    print("Sueldo: ")
    sueldo = readLine()!!.toFloat()
    print("Numero de ventas: ")
    numeroVentas = readLine()!!.toInt()

    if (numeroVentas>0){
        if (numeroVentas<1000){
            bonificacion = 0f
        }else if(numeroVentas < 5000){
            bonificacion = sueldo * 0.03f
        }else if (numeroVentas<20000){
            bonificacion = sueldo * 0.05f
        }else{
            bonificacion = sueldo * 0.08f
        }
    }else{
        null
    }

    print("El trabajador $nombre, tiene derecho una bonficacion de $$bonificacion")
}