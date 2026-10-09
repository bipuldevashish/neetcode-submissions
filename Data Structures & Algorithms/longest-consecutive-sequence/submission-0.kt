
class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toHashSet()
        var result = 0

        for (num in set) {
            if (num - 1 !in set) {
                var current = num
                var count = 1

                while (current < Int.MAX_VALUE && current + 1 in set) {
                    current++
                    count++
                }

                result = maxOf(result, count)
            }
        }

        return result
    }
}