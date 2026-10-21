
class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = java.util.ArrayDeque<Int>()
        var maxArea = 0

        for (i in 0..heights.size) {
            val currentHeight = if (i == heights.size) 0 else heights[i]

            while (stack.isNotEmpty() &&
                heights[stack.peek()] > currentHeight
            ) {
                val height = heights[stack.pop()]

                val width = if (stack.isEmpty()) {
                    i
                } else {
                    i - stack.peek() - 1
                }

                maxArea = maxOf(maxArea, height * width)
            }

            if (i < heights.size) {
                stack.push(i)
            }
        }

        return maxArea
    }
}
