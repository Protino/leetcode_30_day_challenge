/**
 * Created by Gurupad Mamadapur on 04/04/20
 */

fun main() {
    val sol = HappyNumber()
    (1..10).forEach {
        println(sol.isHappy(it))
    }
}