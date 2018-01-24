fun main(vararg args: String) {
    val superMarket = SuperMarket()

    while (true) {
        val inputString = readLine()!!
        superMarket.input(inputString)
        println("Total:" + superMarket.total)
    }
}