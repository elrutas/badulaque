import org.testng.annotations.Test
import kotlin.test.assertTrue

class UnitTests {

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
}