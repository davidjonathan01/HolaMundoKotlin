package com.example.holamundo.Ejercicio1

class Cliente: Persona {
    val telefono: Int

    constructor(nombre:String, apellidos:String, fechaNacimiento: String, sexo: String,telefono: Int):
            super(nombre,apellidos,fechaNacimiento,sexo){
        this.telefono=telefono
    }
}