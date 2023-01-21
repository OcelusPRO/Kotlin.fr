import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class Tests {
    @Test
    fun siTest() {
        val testValue = ""
        val result = si(true) { testValue }
        val resultString: String = result.toString()
        assertEquals(resultString, testValue)
    }
    
    @Test
    fun sinonTest() {
        val testValue = ""
        val elseValue = "else"
        val result = si(false) {
            testValue
        } sinon {
            elseValue
        }
        
        val resultString: String = result.toString()
        assertEquals(resultString, elseValue)
        assertNotEquals(resultString, testValue)
    }
}