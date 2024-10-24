package com.example.holamundo

fun main() {
    val edad: Int = 23
    val primerNombre: String="David"
    val primerApellido: String="Fernandez"
    var nombreCompleto=primerNombre+" "+primerApellido
    println("Nombre Inicial: $nombreCompleto")
    print("Ingrese su segundo nombre : ")
    nombreCompleto= primerNombre+" "+ readLine() + " "+ primerApellido
    println(nombreCompleto)
    print("Ingrese su segundo apellido : ")
    nombreCompleto=nombreCompleto + " "+ readLine()
    println("Nombre completo : $nombreCompleto, Edad: $edad")
}