import org.testng.annotations.Test
import kotlin.test.assertTrue

class UnitTests {

    @Test
    fun cherryDiscount() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("cherry")
        assertTrue(superMarket.total == 75)
        superMarket.input("cherry")
        assertTrue(superMarket.total == 130)
    }

    @Test
    fun discount() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("apple")
        assertTrue(superMarket.total == 100)
        superMarket.input("cherry")
        assertTrue(superMarket.total == 175)
        superMarket.input("cherry")
        assertTrue(superMarket.total == 230)
        superMarket.input("cherry")
        assertTrue(superMarket.total == 305)
        superMarket.input("cherry")
        assertTrue(superMarket.total == 360)
    }

    @Test
    fun csv_input() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("apple,cherry,banana")
        assertTrue(superMarket.total == 325)
    }

    @Test
    fun csv_cherry_discount() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("cherry,cherry")
        assertTrue(superMarket.total == 130)
    }

}