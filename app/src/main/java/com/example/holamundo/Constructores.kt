package com.example.holamundo

class Empleado (nombre: String, edad: Int) {
    var nombre: String
    var edad: Int

    init {
        this.nombre = nombre
        this.edad = edad
        println("constructor1")
    }

    constructor(nombre: String, edad: Int, x: Int) : this(nombre, edad) {
        println("constructor2")
    }

    constructor(nombre: String, edad: Int, x: Int, y: Int) : this(nombre, edad) {
        println("constructor3")
    }

    constructor(nombre: String, edad: Int, x: Int, y: Int, z:Int) : this(nombre, edad) {
        println("constructor4")
    }
}

fun main() {
    var emp2 = Empleado("jose2", 20)
    println(emp2.nombre)
    println(emp2.edad)

    var emp3 = Empleado("jose3", 30, 3)
    println(emp3.nombre)
    println(emp3.edad)

    var emp4 = Empleado("jose4", 40, 4, 4)
    println(emp4.nombre)
    println(emp4.edad)

    var emp5 = Empleado("jose5", 50, 5, 5, 5)
    println(emp5.nombre)
    println(emp5.edad)


}