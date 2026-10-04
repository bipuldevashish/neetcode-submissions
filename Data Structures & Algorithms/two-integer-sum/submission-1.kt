class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sumMap = mutableMapOf<Int, Int>()

        for ((i,num) in nums.withIndex()) {
            sumMap[target-num]?.let {
                return intArrayOf(it, i)
            }
            sumMap[num] = i
        }
        return intArrayOf()
    }
}

