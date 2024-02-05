fun main() {
    val a1 = Articulo("Mouse Gamer", 25.0)
    val a2 = Articulo("Teclado mecánico", 40.0)
    val o1 = Ordenador("Laptop Pro", 1299.99, tipo.GAMING)
    val o2 = Ordenador("Desktop Churro", 399.99)

    /**val articulos = listOf<Articulo>(a1, a2, o1, o2) //Por defecto es tipo Artículo
    articulos.forEach {articulo ->
    articulo.promocionNavidad()
    println(articulo)*/

    val articulos = listOf<Any>(a1, a2, o1, o2) //Por defecto es tipo Artículo
    /**articulos.forEach {articulo ->
    (articulo as Articulo).promocionNavidad()//Le estamos indicando que Any es tipo Artículo
    println(articulo)
    }*/
    articulos.forEach { articulo ->
        try {
            (articulo as Articulo).promocionNavidad()//Le estamos indicando que Any es tipo Artículo
            println(articulo)
        } catch (e.message)
    }
}