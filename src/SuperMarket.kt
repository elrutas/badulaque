class SuperMarket {

    var total : Int = 0

    val banana: String = "banana"
    val cherry: String = "cherry"
    val apple: String = "apple"

    val bananaPrice: Int = 150
    val cherryPrice: Int = 75
    val applePrice: Int = 100

    var totalCherries = 0

    fun input(input: String) {

        val items = input.split(",")

        for (item in items) {
            processItem(item)
        }

    }

    fun processItem(item: String) {
        if (item.equals(banana)) {
            total += bananaPrice
        } else if (item.equals(cherry)) {
            totalCherries = totalCherries + 1
            total += calculateCherryPrice()
        } else if (item.equals(apple)) {
            total += applePrice
        }
    }

    fun calculateCherryPrice() : Int {
        if (totalCherries % 2 == 0) {
            return cherryPrice - 20
        } else {
            return cherryPrice
        }
    }
}