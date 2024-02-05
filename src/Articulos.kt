open class Articulo (var nombre: String, protected open var precio: Double) {

    private val id = totalArticulos

    companion object {
        private var totalArticulos = 0
        private fun generarId() = ++totalArticulos
    }
    /**
     * totalArticulo y generarId tienen que estar en el companion object
     */

    open fun promocionNavidad(rebaja: Double = 15.0) {
        precio -= (precio*rebaja/100)
    }

    override fun toString(): String {
        //return "$nombre - ${ "%.2f".format(precio)}€ )(ID: ${"06d".format(id)}"

        return "$nombre - %.2f€ (ID: %06d)".format(precio, id)
    }
}