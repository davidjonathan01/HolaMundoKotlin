package com.example.holamundo.Ejercicio1

open class Persona(nombre:String, apellidos:String, fechaNacimiento: String, sexo: String){
    val nombre: String
    val apellidos: String
    val fechaNacimiento: String
    val sexo: String

    init{
        this.nombre=nombre
        this.apellidos=apellidos
        this.fechaNacimiento=fechaNacimiento
        this.sexo  =sexo
    }
}