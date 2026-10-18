class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size)
        val stack = Stack<Int>()

        for (i in temperatures.indices) {
            while (stack.isNotEmpty() &&
                temperatures[i] > temperatures[stack.peek()]
            ) {
                val prevIndex = stack.pop()
                result[prevIndex] = i - prevIndex
            }

            stack.push(i)
        }

        return result
    }
}