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
    fun cherryDiscountFour() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("cherry")
        assertTrue(superMarket.total == 75)
        superMarket.input("cherry")
        assertTrue(superMarket.total == 130)
        superMarket.input("cherry")
        assertTrue(superMarket.total == 205)
        superMarket.input("cherry")
        assertTrue(superMarket.total == 260)
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

    @Test
    fun banana_discount() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("cherry,cherry,banana,banana")
        assertTrue(superMarket.total == 280)
    }

    @Test
    fun localisation() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("apple,manzana,apfel")
        assertTrue(superMarket.total == 300)
    }

    @Test
    fun manzana_discount() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("manzana,manzana,manzana,manzana")
        assertTrue(superMarket.total == 300)
    }

    @Test
    fun apfel_discount() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("apfel,apfel")
        assertTrue(superMarket.total == 50)
    }

    @Test
    fun apples_y_manzanas() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("apple,manzana,manzana,apfel")
        assertTrue(superMarket.total == 400)
    }

    @Test
    fun five_fruit_discount() {
        val superMarket: SuperMarket = SuperMarket()

        superMarket.input("apfel,manzana,manzana,apfel")
        assertTrue(superMarket.total == 250)

        superMarket.input("banana")
        assertTrue(superMarket.total == 200)

        superMarket.input("apfel,manzana,manzana,apple,apfel")
        assertTrue(superMarket.total == 250)
    }
}