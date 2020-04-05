/**
 * Created by Gurupad Mamadapur on 04/04/20
 */

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        return nums.reduce { i,j ->
            i xor j
        }
    }
}