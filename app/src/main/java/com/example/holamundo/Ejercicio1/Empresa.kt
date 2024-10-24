package com.example.holamundo.Ejercicio1

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
            // Si el empleado tiene categoría, la añadimos en la misma línea
            if (empleado.categoria != null) {
                sb.append("${empleado.nombre} ${empleado.apellidos}, Sueldo Bruto: ${empleado.sueldoBruto}, Categoría: ${empleado.categoria}\n")
            } else {
                sb.append("${empleado.nombre} ${empleado.apellidos}, Sueldo Bruto: ${empleado.sueldoBruto}\n")
            }
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