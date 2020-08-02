package aug.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Gurupad Mamadapur on 02/08/20
 */
class DetectCapitalTest {

    @Test
    void solve() {
        final String[] testCases = {"USA", "Mary", "anthonny", "sPeakK", "asdwaEEEEasdasd", "sAAAA", "AAAs"};
        final Boolean[] answers = {true, true, true, false, false, false, false};

        for (int i = 0; i < testCases.length; i++) {
            assertTrue(DetectCapital.solve(testCases[i]) == answers[i],
                    "Case - " + testCases[i]);
        }
    }
}