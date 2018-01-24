fun main(vararg args: String) {
    val superMarket = SuperMarket()

    while (true) {
        val inputString = readLine()!!
        if (inputString.equals("exit")) {
            break
        }
        superMarket.input(inputString)
        println("Total:" + superMarket.total)
    }
}