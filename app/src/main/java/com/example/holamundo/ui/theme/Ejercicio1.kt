package com.example.holamundo.ui.theme

// Clase Persona
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


// Clase Empleado, que hereda de Persona
open class Empleado: Persona{
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

// Clase Cliente, que hereda de Persona
class Cliente: Persona{
    val telefono: Int

    constructor(nombre:String, apellidos:String, fechaNacimiento: String, sexo: String,telefono: Int):
            super(nombre,apellidos,fechaNacimiento,sexo){
                this.telefono=telefono
    }
}


// Clase Empresa
class Empresa(nombre: String) {
    val nombre:String
    val empleados: MutableList<Empleado> = mutableListOf()
    val clientes: MutableList<Cliente> = mutableListOf()
    init{
        this.nombre=nombre
    }

    fun agregarEmpleado(empleado: Empleado) {
        empleado.empresa=this
        empleados.add(empleado)
    }

    fun agregarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun mostrarPersonal(): String {
        val sb = StringBuilder()
        sb.append("Empleados de la empresa $nombre:\n")
        empleados.forEach { empleado ->
            sb.append("${empleado.nombre} ${empleado.apellidos}, Categoría: ${empleado.categoria}, Sueldo Bruto: ${empleado.sueldoBruto}\n")
            if (empleado.subordinados.isNotEmpty()) {
                sb.append("  Subordinados:\n")
                empleado.subordinados.forEach { sub ->
                    sb.append("    ${sub.nombre} ${sub.apellidos}, Sueldo Bruto: ${sub.sueldoBruto}\n")
                }
            }
        }
        return sb.toString()
    }

    fun mostrarClientes(): String {
        val sb = StringBuilder()
        sb.append("\nClientes de la empresa $nombre:\n")
        clientes.forEach { cliente ->
            sb.append("Nombre: ${cliente.nombre}, Cliente: ${cliente.apellidos}, Teléfono: ${cliente.telefono}\n")
        }
        return sb.toString()
    }
}

// Ejemplo de uso
fun main() {
    // Creación de una empresa
    val empresa = Empresa("Tech Solutions")

    // Creación de empleados y directivos
    val empleado1 = Empleado("Juan", "Pérez", "1985-10-10", "M", 2500)
    val empleado2 = Empleado("Luis", "Rodríguez", "1992-03-22", "M", 1800)
    val directivo1= Empleado("Diego", "Cuchillo", "01/01/01", "M", 8000, "Capataz")

    // Asignación de subordinados al directivo
    //directivo1.agregarSubordinado(empleado2)

    // Agregar empleados y directivos a la empresa
    empresa.agregarEmpleado(empleado1)
    empresa.agregarEmpleado(empleado2)
    empresa.agregarEmpleado(directivo1)

    directivo1.agregarSubordinado(empleado2)
    directivo1.agregarSubordinado(empleado1)

    // Creación de clientes
    val cliente1 = Cliente("Carlos", "Martínez", "1980-12-02", "M", 987654321)
    val cliente2 = Cliente("Laura", "Fernández", "1995-07-15", "F", 912345678)

    // Agregar clientes a la empresa
    empresa.agregarCliente(cliente1)
    empresa.agregarCliente(cliente2)

    // Mostrar datos de empleados
    println(empresa.mostrarPersonal())

    //Mostrar datos de clientes
    println(empresa.mostrarClientes())

    print(empleado1.directivo?.nombre)
    print(empleado2.directivo?.nombre)
    print(empleado1.empresa?.nombre)
    print(empleado2.empresa?.nombre)

}