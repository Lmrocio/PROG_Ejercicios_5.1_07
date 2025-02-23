open class Vehiculo(val marca: String,
                    val modelo: String,
                    val capacidadCombustible: Int) {


    /**
     * Esta función muestra la información del vehículo.
     */
    fun mostrarInformacion(){

        println("El vehículo es de la marca $marca, modelo $modelo y capacidad de combustible $capacidadCombustible.")

    }

    /**
     * Esta función calcula la cantidad de autonomia que tiene el vehículo en base a su capacidad
     * de combustible
     *
     * @return Int
     */
    open fun calcularAutonomia(): Int{

        return capacidadCombustible * 10

    }

}