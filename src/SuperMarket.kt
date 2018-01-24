class SuperMarket {

    var total : Int = 0

    val banana: String = "banana"
    val cherry: String = "cherry"
    val apple: String = "apple"

    val bananaPrice: Int = 150
    val cherryPrice: Int = 75
    val applePrice: Int = 100

    var totalCherries = 0

    fun input(text: String) {
        if (text.equals(banana)) {
            total = total + bananaPrice
        } else if (text.equals(cherry)) {
            totalCherries = totalCherries + 1
            if (totalCherries % 2 == 0) {
                total = total + (cherryPrice - 20)
            } else {
                total = total + cherryPrice
            }
        } else if (text.equals(apple)) {
            total = total + applePrice
        }
    }

}