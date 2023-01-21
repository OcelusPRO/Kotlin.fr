import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class FrenchIfTest {
    @Test
    fun `test de si pour un String`() {
        val testValue = ""
        val result = si(true) { testValue }
        
        assertEquals(result.ifResult, testValue)
    }
    
    @Test
    fun `test de sinon pour un String`() {
        val testValue = ""
        val elseValue = "else"
        val result = si(false) {
            testValue
        } sinon {
            elseValue
        }
        
        assertEquals(result, elseValue)
        assertNotEquals(result, testValue)
    }
    
    @Test
    fun `test de si pour un Int`() {
        val testValue = 0
        val result = si(true) { testValue }
        
        assertEquals(result.ifResult, testValue)
    }
    
    @Test
    fun `test de sinon pour un Int`() {
        val testValue = 0
        val elseValue = 1
        val result = si(false) {
            testValue
        } sinon {
            elseValue
        }
        
        assertEquals(result, elseValue)
        assertNotEquals(result, testValue)
    }
    
    @Test
    fun `test de si pour une Pair`() {
        val testValue = Pair("salut", "bonjour")
        val result = si(true) { testValue }
        
        assertEquals(result.ifResult, testValue)
    }
    
    @Test
    fun `test de sinon pour une Pair`() {
        val testValue = Pair("salut", "bonjour")
        val elseValue = Pair("bonsoir", "bonne nuit")
        val result = si(false) {
            testValue
        } sinon {
            elseValue
        }
        
        assertEquals(result, elseValue)
        assertNotEquals(result, testValue)
    }
}