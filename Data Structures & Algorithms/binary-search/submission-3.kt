class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val n = nums.size
        var left = 0
        var right = n - 1

        while (left <= right) {
            val mid = (left + right) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return -1
    }
}
