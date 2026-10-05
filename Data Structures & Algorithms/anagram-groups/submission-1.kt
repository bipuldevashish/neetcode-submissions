class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val tempList = mutableListOf<String>()
        val visited = BooleanArray(strs.size)
        if (strs.isNotEmpty()) {
        for (i in strs.indices){
            if (visited[i]) continue

            visited[i] = true
            tempList.add(strs[i])
            for (j in strs.indices){
                if (i != j && !visited[j]){
                    if (isAnagram(strs[i], strs[j])){
                        tempList.add(strs[j])
                        visited[j] = true
                    }
                }
            }
                result.add(tempList.toList())
                tempList.clear()
                        
            }
        }
        return result
    }

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val idxArray = IntArray(26)
        for (i in s.indices) {
            idxArray[s[i] - 'a']++
            idxArray[t[i] - 'a']--
        }
        return idxArray.all {it == 0}
    }
}
