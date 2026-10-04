class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for (i in nums.indices){
            for (j in nums.indices){
                if(nums[i] + nums[j] == target){
                    if(i<j){
                    result[0]= i
                    result[1]= j
                    }else {
                    
                    result[0]= j
                    result[1]= i 
                    }
                    break
                }
            }
        }
        return result
    }
}
