
class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val cars = position.indices
            .map { position[it] to speed[it] }
            .sortedByDescending { it.first }

        var fleets = 0
        var lastTime = 0.0

        for ((pos, spd) in cars) {
            val time = (target - pos).toDouble() / spd

            if (time > lastTime) {
                fleets++
                lastTime = time
            }
        }

        return fleets
    }
}
