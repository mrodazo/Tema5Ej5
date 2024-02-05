class Ordenador(
    nombre: String,
    precio: Double,
    val tipoOrdenador: tipo = tipo.BASICO
) : Articulo(nombre, precio) {

    override fun promocionNavidad(rebaja: Double) {
        if (precio > 500) {
            super.promocionNavidad(rebaja)
        }

    }
}