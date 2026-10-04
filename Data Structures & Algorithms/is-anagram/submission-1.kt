class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val idxArray = IntArray(26)
        for (i in s.indices) {
            idxArray[s[i] - 'a']++
            idxArray[t[i] - 'a']--
        }

        return idxArray.all { it == 0}
    }
}
