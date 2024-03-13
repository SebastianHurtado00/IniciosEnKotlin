import java.time.LocalDate

fun Ejercicio7(){
    var anio:Int = LocalDate.now().year
    var anioNacimento:Int = 0;
    var edad:Int = 0;

    print("Ingresa tu año de nacimiento: ")
    anioNacimento = readLine()!!.toInt()
    edad = anio - anioNacimento

    println("Tienes: $edad")
}