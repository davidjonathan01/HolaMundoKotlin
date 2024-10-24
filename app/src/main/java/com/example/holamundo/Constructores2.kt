package com.example.holamundo

open class Empleados constructor(nombre: String, sueldoBase: Double) {
    var nombre: String
    var sueldoBase: Double


    init {
        println("Empleado: Bloque init comienza")
        this.nombre = nombre
        this.sueldoBase = sueldoBase
        println("constructor1")
        println("Empleado: Nombre -> $nombre, Sueldo Base -> $sueldoBase")
    }

    open fun calcularSueldoMensual(): Double {
        println("Empleado: Calcular sueldo mensual")
        return sueldoBase * 0.75
    }
}

class Gerente : Empleados {
    var area: String = "Por definir"

    constructor(nombre: String, sueldoBase: Double, area: String) : super(nombre, sueldoBase) {
        this.area = area
        println("Gerente: Área -> $area")
    }
}

class Vendedor : Empleados {
    var comisiones: Double = 0.0

    constructor(nombre: String, sueldoBase: Double, comisiones: Double) : super(nombre, sueldoBase) {
        this.comisiones = comisiones
    }

    override fun calcularSueldoMensual(): Double {
        return (sueldoBase + comisiones) * 0.75
    }
}

fun main() {
    println("Creando instancia de Gerente")
    val gerente = Empleados("Ana", 3000.0)
    gerente.calcularSueldoMensual()
}