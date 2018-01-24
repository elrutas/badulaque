class SuperMarket {

    var total : Int = 0

    private val banana: String = "banana"
    private val cherry: String = "cherry"
    private val apple: List<String> = listOf("apple", "apfel", "manzana")

    private val bananaPrice: Int = 150
    private val cherryPrice: Int = 75
    private val applePrice: Int = 100

    private var totalCherries = 0
    private var totalBananas = 0

    fun input(input: String) {

        val items = input.split(",")

        for (item in items) {
            processItem(item)
        }

    }

    fun processItem(item: String) {
        if (item.equals(banana)) {
            totalBananas = totalBananas + 1
            total += calculateBananaPrice()
        } else if (item.equals(cherry)) {
            totalCherries = totalCherries + 1
            total += calculateCherryPrice()
        } else if (apple.contains(item)) {
            total += applePrice
        }
    }

    private fun calculateCherryPrice() : Int {
        if (totalCherries % 2 == 0) {
            return cherryPrice - 20
        } else {
            return cherryPrice
        }
    }

    private fun calculateBananaPrice() : Int {
        if (totalBananas % 2 == 0) {
            return 0
        } else {
            return bananaPrice
        }
    }
}