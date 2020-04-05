/**
 * Created by Gurupad Mamadapur on 04/04/20
 */
class HappyNumber {

    private var slowSum = 0
    private var fastSum = 0

    fun isHappy(n: Int): Boolean {
        slowSum = n
        fastSum = n
        do {
            slowSum = squareSumOfDigits(slowSum)
            fastSum = squareSumOfDigits(squareSumOfDigits(fastSum))

            if (slowSum == 1 || fastSum == 1){
                return true
            }
        } while (slowSum != fastSum)

        return slowSum == 1
    }

    private inline fun squareSumOfDigits(n: Int): Int {
        var squareSum = 0
        var num = n
        while (num != 0) {
            squareSum += (num % 10) * (num % 10) // %10 gives the digit
            num /= 10 // division removes the unit place digit
        }
        return squareSum
    }
}