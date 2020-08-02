package aug.week1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Created by Gurupad Mamadapur on 03/08/20
 */
internal class DetectCapitalTest {
    @Test
    fun solve() {
        val testCases =
            arrayOf("USA", "Mary", "anthonny", "sPeakK", "asdwaEEEEasdasd", "sAAAA", "AAAs")
        val answers = arrayOf(true, true, true, false, false, false, false)
        for (i in testCases.indices) {
            Assertions.assertTrue(
                DetectCapital.solve(testCases[i]) == answers[i],
                "Case - " + testCases[i]
            )
        }
    }
}