class Solution {
    fun trap(height: IntArray): Int {
        var l = 0
        var r = height.size - 1
        var leftMax = 0
        var rightMax = 0
        var water = 0

        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= leftMax) {
                    leftMax = height[l]
                } else {
                    water += leftMax - height[l]
                }
                l++
            } else {
                if (height[r] >= rightMax) {
                    rightMax = height[r]
                } else {
                    water += rightMax - height[r]
                }
                r--
            }
        }

        return water
    }
}