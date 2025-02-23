fun main(){

    val vehiculo1 = Vehiculo("Toyota", "Corolla", 50)
    val auto1 = Automovil("Ford", "Focus", 60, Tipo.SEDAN)
    val moto1 = Motocicleta("Honda", "CBR", 15, 250)

    println("****Vehículo 1:")
    vehiculo1.mostrarInformacion()
    println("Autonomía: ${vehiculo1.calcularAutonomia()} km")
    println()

    println("****Automóvil 1:")
    auto1.mostrarInformacion()
    println("Autonomía: ${auto1.calcularAutonomia()} km")
    println()

    println("****Motocicleta 1:")
    moto1.mostrarInformacion()
    println("Autonomía: ${moto1.calcularAutonomia()} km")
}

