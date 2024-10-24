package com.example.holamundo

fun main() {
    /*Ingrese el nombre del estudiante: Juan Pérez
    Ingrese la calificación de Matemáticas: 7.5
    Ingrese la calificación de Ciencias: 8.0
    Ingrese la calificación de Literatura: 5.5
    El promedio de Juan Pérez es: 7.0
    Juan Pérez ha aprobado.*/
    val nombre:String
    val notaMatematicas:Double
    val notaCiencias:Double
    val notaLiteratura:Double

    print("Ingrese el nombre del Estudiante: ")
    nombre= readLine()?:"Desconocido"
    notaMatematicas= ingresarNota("Matematicas")
    notaCiencias= ingresarNota("Ciencias")
    notaLiteratura= ingresarNota("Literatura")

    val promedio=calcularPromedio(notaMatematicas,notaCiencias,notaLiteratura)
    print("El promedio de $nombre es $promedio")
    mostrarResultado(nombre,promedio)
}

fun ingresarNota(materia: String): Double{
    var nota: Double
    do{
        print("Ingrese la nota para la materia $materia: ")
        nota= readLine()?.toDoubleOrNull()?: -1.0
        if(nota<0 || nota>20){
            println("Nota no válida. La nota debe estar entre 0 y 20")
        }
    }while(nota<0 || nota>20)
    return nota
}

fun calcularPromedio(nota1: Double, nota2: Double, nota3: Double): Double{
    return (nota1+nota2+nota3)/3
}

fun mostrarResultado(nombre: String="Estudiante", promedio: Double): Unit{
    if(promedio>10.5){
        println("\n$nombre ha aprobado")
    }else{
        println("\n$nombre ha jalado")
    }
}
