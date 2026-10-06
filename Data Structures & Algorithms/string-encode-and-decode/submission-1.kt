class Solution {

    fun encode(strs: List<String>): String {
        if (strs.isEmpty()){
            return "#"
        }

        var result = ""
        
        for ( (index, str) in strs.withIndex()){
            val encoded = Base64.getEncoder()
                .encodeToString(str.toByteArray())
                
                if (index > 0){
                    result += "|"
                }
                result += encoded
            }
        return result
    }

    fun decode(str: String): List<String> {
        if (str == "#"){
            return emptyList()
        }
            val result = mutableListOf<String>()
            val list = str.split("|")
            for (str in list){
                val decoded = String(Base64.getDecoder()
                    .decode(str))
                result.add(decoded)    
            }
        
    return result
    }
}
