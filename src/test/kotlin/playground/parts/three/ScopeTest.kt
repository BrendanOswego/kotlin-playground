package playground.parts.three

import org.junit.Before
import org.junit.Test
import playground.data.models.User
import kotlin.test.assertNotNull

class ScopeTest {

    private lateinit var tester: Scope
    private lateinit var user: User

    @Before
    fun setup() {
        tester = Scope()
        user = User("test", "user", 42)
    }

    @Test
    fun `should create Scope instance`() {
        assertNotNull(tester)
    }

    @Test
    fun `should call with function`() {
        tester.`with function`(user)
    }

    @Test
    fun `should call let function`() {
        tester.`let function`(user)
    }

    @Test
    fun `should call apply function`() {
        tester.`apply function`()
    }

    @Test
    fun `should call also function`() {
        tester.`also function`(user)
    }

}