class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val intList = mutableListOf<Int>()
        val map = mutableMapOf<Int, Int>()
        for (num in nums){
            map[num] = ( map[num] ?: 0 ) + 1
        }

        val result = map.entries
                        .sortedByDescending {it.value}
                        .take(k)
                        .map {it.key}

        val intArray = result.toIntArray()
        return intArray
    }
}
