package junit.flaky

import org.junit.jupiter.api.Test
import kotlin.random.Random

/**
 * Flaky tests.
 *
 * @author Johnny Lim
 */
class FlakyTests {

    @Test
    fun test() {
        if (Random.nextBoolean()) {
            throw RuntimeException("Expected flakiness!")
        }
    }

}
