package com.example.holamundo

fun main(){
    val opcion= mostrarMenu()
    while (opcion !=1 && opcion!= 2 && opcion!=3){
        println("Digite una opcion valida")
    }
    if(opcion==1){
        print("Ingrese el radio : ")
        val area= calcularAreaCirculo(readLine()?.toIntOrNull()?:0)
        println("El area del circulo es : $area")
    }
    else if(opcion==2){
        print("Ingrese la base del rectangulo : ")
        val base= readLine()?.toFloatOrNull()?:0f
        print("Ingrese la altura del rectangulo : ")
        val altura= readLine()?.toFloatOrNull()?:0f
        val area = calcularAreaRectangulo(base,altura)
        println("El area del rectangulo es : $area")
    }
    else{
        print("Ingrese la base del triangulo : ")
        val base= readLine()?.toFloatOrNull()?:0f
        print("Ingrese la altura del triangulo : ")
        val altura= readLine()?.toFloatOrNull()?:0f
        val area = calcularAreaTriangulo(base, altura)
        println("El area del triangulo es : $area")

    }



}

fun calcularAreaCirculo(radio: Int):Double {
    val area=Math.PI*radio*radio
    return area
}

fun calcularAreaRectangulo (base: Float, altura: Float): Float{
    val area=base*altura
    return area
}

fun calcularAreaTriangulo (base:Float, altura: Float): Float{
    val area=(base*altura)/2
    return area
}

fun mostrarMenu(): Int{
    println("Seleccione la figura para calcular el area: ")
    println("1. Círculo")
    println("2. Rectangulo")
    println("3. Triángulo")
    print("Opcion : ")
    val opcion = readLine()?.toIntOrNull()?:-1
    return opcion
}
