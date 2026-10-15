class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0){
            return false
        }
        var isClosed = true
        val stack = Stack<Char>()
        for (bracket in s){
            if (!isClosed){
                break
            }
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                    
                    stack.push(bracket)
                    
                } else {
            if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()){
                    isClosed = false
                    break
                }else {
                val lastIndex = stack.pop()
                
                isClosed = when (bracket) {   
                        ')' -> lastIndex == '('
                        ']' -> lastIndex == '['
                        '}' -> lastIndex == '{'
                        else -> false
                    }
                }
                }
            }
        }
        if (!stack.isEmpty){
            isClosed = false
        }
        return isClosed
    }
}
