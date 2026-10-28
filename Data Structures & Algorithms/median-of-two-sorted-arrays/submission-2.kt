class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

val mixedList = mutableListOf<Int>()
mixedList.addAll(nums1.toList())
mixedList.addAll(nums2.toList())
mixedList.sort()
val size = mixedList.size
val mid = (mixedList.size - 1) / 2
if (size % 2 == 0){
    val sum = (mixedList[mid] + mixedList[mid + 1]).toDouble()
    val median = sum / 2
    return median 
}else {
    return mixedList[mid].toDouble()
}
    }
}
