package playground

import kotlinx.coroutines.runBlocking
import playground.parts.one.Variables
import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {

    @Test
    fun `should run main method`() {
        assertNotNull(main(arrayOf("Kotlin")))
    }
}
