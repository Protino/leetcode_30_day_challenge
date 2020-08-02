package aug.week1

/**
 * Created by Gurupad Mamadapur on 02/08/20
 */
object DetectCapital {
    fun solve(word: String): Boolean {
        val length = word.length
        if (length == 0) {
            return true
        }
        val firstChar = word[0]
        return if (isCapital(firstChar)) {
            if (!isCapital(word[length - 1])) {
                !word.substring(1).any { isCapital(it) }
            } else {
                word.substring(1).all { isCapital(it) }
            }
        } else {
            // make sure the next ones are not
            word.substring(1).all { !isCapital(it) }
        }
    }

    private fun isCapital(s: Char): Boolean {
        return s in 'A'..'Z'
    }
}