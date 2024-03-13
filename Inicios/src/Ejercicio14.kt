fun Ejercicio14(){
    var valorHerencia:Float =0f
    var pedro:Float = 0f
    var julio:Float = 0f
    var pablo:Float = 0f
    var jose:Float = 0f

    print("Ingrese el valor de la herencia: ")
    valorHerencia = readLine()!!.toFloat()

    pedro = valorHerencia * 0.3f
    valorHerencia-=pedro

    julio = valorHerencia * 0.5f
    valorHerencia-=julio

    pablo = valorHerencia * 0.7f
    valorHerencia-=pablo

    jose = valorHerencia

    println("Pedro: $pedro")
    println("Julio: $julio")
    println("pablo: $pablo")
    println("Jose: $jose")
}