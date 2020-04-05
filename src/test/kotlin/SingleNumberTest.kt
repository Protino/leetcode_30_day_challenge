import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.random.Random

/**
 * Created by Gurupad Mamadapur on 04/04/20
 */
internal class SingleNumberTest {
    @Test
    fun singleNumber() {

        val inputs = listOf(100).map { generateRandomCase() }
        val answers = inputs.map { bruteForce(it) }
        val obj = SingleNumber()

        inputs.zip(answers).forEach {
            assertTrue(
                obj.singleNumber(it.first.toIntArray()) == it.second,
                "Actual - ${it.first} Expected - ${it.second}"
            )
        }
    }

    private fun bruteForce(list: List<Int>): Int {
        val set = mutableSetOf<Int>()
        val dups = mutableSetOf<Int>()
        list.forEach {
            if (it !in set) {
                set.add(it)
            } else {
                dups.add(it)
            }
        }
        list.forEach {
            if (it !in dups) {
                return it
            }
        }

        return -1
    }

    private fun generateRandomCase(): List<Int> {
        val random = List(Random.nextInt(1, 10000)) { Random.nextInt(0, 100000) }
        var unique = Random.nextInt(0, 100000)
        while (unique in random) {
            unique = Random.nextInt(0, 100000)
        }
        return random.toList().nCopies(2) + listOf(unique)
    }
}