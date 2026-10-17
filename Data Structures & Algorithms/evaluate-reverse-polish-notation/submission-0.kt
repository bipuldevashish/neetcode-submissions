class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val operators = listOf("+", "-", "*", "/")
        val stack = Stack<Int>()
    
        for (i in tokens.indices){
            if ( tokens[i] in operators){
                val first = stack.pop()
                val second = stack.pop()
                val result = when (tokens[i]) {
                "+" -> second + first
                "-" -> second - first
                "*" -> second * first
                "/" -> second / first
                else -> 0
                }
                stack.push(result)
            }else {
                stack.push(tokens[i].toInt())
            }
        }
        if(stack.isNotEmpty()){
            return stack.pop()
        }else {
            return 0
        }
    }
}
