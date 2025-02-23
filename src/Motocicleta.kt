class Motocicleta(marca: String,
                  modelo: String,
                  capacidadCombustible: Int,
                  val cilindrada: Int)
    : Vehiculo(marca, modelo, capacidadCombustible){


    /**
     * Reescribe la función heredada de Vehículo para calcular la autonomía de la motocicleta.
     *
     * @return Int
     */
    override fun calcularAutonomia(): Int{
        val autonomia = super.calcularAutonomia()

        return autonomia - 40

    }


}