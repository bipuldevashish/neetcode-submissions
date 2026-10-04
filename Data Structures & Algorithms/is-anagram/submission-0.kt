class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length == t.length){
            val list = t.toMutableList()
            for (i in 0 until s.length){
                for (j in list.indices){
                    if (s[i] == list[j]){
                        list.removeAt(j)
                        break
                    }
                }
                if(i == s.length - 1){
                    if(list.isEmpty()){
                        return true
                    }
                }
            }
        }
        return false
    }
}
