class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = mutableMapOf<List<Int>, MutableList<String>>()

        for (str in strs) {

            val count = IntArray(26)

            for (char in str) {
                count[char - 'a']++
            }

            map.getOrPut(count.toList()) {
                mutableListOf()
            }.add(str)
        }

        return map.values.toList()
    }
}