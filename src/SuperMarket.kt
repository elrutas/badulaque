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

    private var totalManzanas = 0
    private var totalApfel = 0
    private var totalApple = 0

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
            total += calculateApplePrice(item)
        }

        applyDiscount()
    }

    private fun applyDiscount() {
        if ((totalCherries + totalBananas + totalManzanas + totalApfel + totalApple) % 5 == 0) {
            total -= 200
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

    private fun calculateApplePrice(item: String) : Int {
        if (item.equals("manzana")) {
            totalManzanas += 1
            if (totalManzanas % 3 == 0) {
                return 0
            }
        } else if (item.equals("apfel")) {
            totalApfel += 1
            if (totalApfel % 2 == 0) {
                return applePrice - 150
            }
        } else if(item.equals("apple")) {
            totalApple += 1
            if (totalApple % 4 == 0) {
                return applePrice - 100
            }
        }

        return applePrice
    }
}