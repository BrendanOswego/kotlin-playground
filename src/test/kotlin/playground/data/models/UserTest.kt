package playground.data.models

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class UserTest {

    private lateinit var tester: User

    @Before
    fun setup() {
        tester = User("test", "user", 42)
    }

    @Test
    fun `should create user`() {
        assertNotNull(tester)
    }

    @Test
    fun `should assert first name`() {
        assertEquals(tester.firstName, "test")
    }

    @Test
    fun `should assert last name`() {
        assertEquals(tester.lastName, "user")
    }

    @Test
    fun `should assert age`() {
        assertEquals(tester.age, 42)
    }

    @Test
    fun `should create identical user`() {
        val user = User()
        user.firstName = "test"
        user.lastName = "user"
        user.age = 42

        assertEquals(tester.firstName, user.firstName)
    }
}