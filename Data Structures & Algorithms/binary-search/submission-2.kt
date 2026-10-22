class Solution {
    fun search(nums: IntArray, target: Int): Int {
        
        if (nums.isEmpty()){
            return -1
        }
        
        var left = 0 
        var right = nums.size - 1
        var index = -1

        while (left <= right){
            var middle = left + (right - left) / 2

            if (nums[middle] == target){
                index = middle
                break
            }
            if (nums[middle]< target){
                left = middle + 1 
            }else {
                right = middle - 1
            } 
        } 
        return index
    }
}
