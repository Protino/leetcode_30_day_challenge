import java.lang.IllegalArgumentException
import java.util.*
import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Created by Gurupad Mamadapur on 04/04/20
 */

internal fun <E> List<E>.nCopies(times: Int): List<E> {

    val result = mutableListOf<E>()
    repeat(times) {
        result.addAll(this)
    }

    return result
}

internal inline fun <reified E> Random.randomList(size: Int): List<E> {
    val result = mutableListOf<E>()
    repeat(size) {
        val x = when (E::class) {
            Int::class -> Random.nextInt()
            String::class -> UUID.randomUUID().toString().take(Random.nextInt(1, 32))
            Long::class -> Random.nextLong()
            Double::class -> Random.nextDouble()
            Boolean::class -> Random.nextBoolean()
            else -> throw IllegalArgumentException("Type not supported")
        }
        result.add(x as E)
    }

    return result
}