class TimeMap() {

    data class Entry (
        val timestamp: Int,
        val value: String
    )

    private val map = HashMap <String, MutableList<Entry>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.getOrPut(key){ mutableListOf() }
            .add(Entry(timestamp, value))
    }

    fun get(key: String, timestamp: Int): String {
            val list = map[key] ?: return ""

            var low = 0
            var high = list.size - 1
            var result = ""

            while (low <= high){
                val mid = low + (high - low)/ 2
                if (list[mid].timestamp <= timestamp){
                    result = list[mid].value
                    low = mid + 1
                }else {
                    high = mid - 1
                }
            }
            return result
    }
}
