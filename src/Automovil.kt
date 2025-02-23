class Automovil(marca: String,
                modelo: String,
                capacidadCombustible: Int,
                val tipo: Tipo)
    : Vehiculo(marca, modelo, capacidadCombustible) {

    /**
     * Reescribe la función que hereda de la clase Vehículo para que calcule la autonomia
     * del automovil
     *
     * @return Int
      */
    override fun calcularAutonomia(): Int{
        val autonomia = super.calcularAutonomia()

        return autonomia + 100

    }
}