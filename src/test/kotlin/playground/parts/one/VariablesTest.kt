package playground.parts.one

import org.junit.Before
import org.junit.Test
import kotlin.test.assertNull

/**
 * Tests methods within the [Variables] class.
 */
class VariablesTest {

    private lateinit var tester: Variables

    @Before
    fun setup() {
        tester = Variables()
    }

    @Test
    fun `should create implicit var string`() {
        assertNull(tester.`create implicit var string`())
    }

    @Test
    fun `should create explicit var string`() {
        assertNull(tester.`create explicit var string`())
    }

    @Test
    fun `should create implicit val string`() {
        assertNull(tester.`create implicit val string`())
    }

    @Test
    fun `should create explicit val string`() {
        assertNull(tester.`create explicit val string`())
    }
}