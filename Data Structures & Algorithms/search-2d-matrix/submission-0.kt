class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        var isTarget = false
        for (item in matrix){
            val lastIndex = item.size - 1
            if (target <= item[lastIndex]){
                val result = search(item, target)
                if (result != -1){
                    isTarget = true
                }
            }else{
                continue
            }
        }
        return isTarget
    }

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
