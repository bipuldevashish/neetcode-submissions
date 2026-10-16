class MinStack() {

    private val stack = Stack<Int>()
    private val minStack = Stack<Int>()

    fun push(`val`: Int) {
        stack.push(`val`)

        if (minStack.isEmpty() || `val` <= minStack.peek()) {
            minStack.push(`val`)
        }
    }

    fun pop() {
        val removed = stack.pop()

        if (removed == minStack.peek()) {
            minStack.pop()
        }
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return minStack.peek()
    }
}
