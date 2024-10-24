package com.example.holamundo.Ejercicio1

class Empleado: Persona {
    val sueldoBruto: Int
    var categoria: String?=null
    var directivo: Empleado?=null
    val subordinados: MutableList<Empleado> = mutableListOf()
    var empresa: Empresa?=null

    constructor(nombre:String, apellidos:String, fechaNacimiento: String, sexo: String, sueldoBruto: Int):
            super(nombre, apellidos, fechaNacimiento, sexo){
        this.sueldoBruto=sueldoBruto
    }

    constructor(nombre:String, apellidos:String, fechaNacimiento: String, sexo: String, sueldoBruto: Int, categoria:String):
            super(nombre, apellidos, fechaNacimiento, sexo){
        this.sueldoBruto=sueldoBruto
        this.categoria=categoria
    }

    fun agregarSubordinado(empleado: Empleado) {
        empleado.directivo=this
        this.subordinados.add(empleado)
    }
}