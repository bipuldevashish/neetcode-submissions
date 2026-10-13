class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.size - 1
        var maxArea = 0
        while(left < right){
            val height = min(heights[left], heights[right])
            val length = right - left
            val area = height * length
            if (maxArea < area){
                maxArea = area
            }
            if (heights[left] <= heights[right]){
                left ++
            }else {
                right -- 
            }
        }
        return maxArea
    }
}
