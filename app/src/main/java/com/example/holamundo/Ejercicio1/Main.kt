package com.example.holamundo.Ejercicio1


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