import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ArithmeticOperationsTest {

    @Test
    fun testAddition() {
        assertEquals(15, add(10, 5))
        assertEquals(-5, add(-10, 5))
        assertEquals(0, add(0, 0))
    }

    @Test
    fun testSubtraction() {
        assertEquals(5, subtract(10, 5))
        assertEquals(-15, subtract(-10, 5))
        assertEquals(0, subtract(5, 5))
    }

    @Test
    fun testMultiplication() {
        assertEquals(50, multiply(10, 5))
        assertEquals(-50, multiply(-10, 5))
        assertEquals(0, multiply(10, 0))
    }

    @Test
    fun testDivision() {
        assertEquals(2.0, divide(10, 5), 0.001)
        assertEquals(-2.0, divide(-10, 5), 0.001)
        assertEquals(0.0, divide(0, 5), 0.001)
    }

    @Test
    fun testDivisionByZero() {
        assertThrows<ArithmeticException> {
            divide(10, 0)
        }
    }
}
