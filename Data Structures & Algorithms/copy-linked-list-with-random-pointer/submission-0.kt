/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(node: Node?): Node? {

        if (node == null) return null

        val map = HashMap<Node, Node>()

        var current = node

        // Step 1: Create copies of all nodes
        while (current != null) {
            map[current] = Node(current.`val`)
            current = current.next
        }

        // Step 2: Assign next and random pointers
        current = node

        while (current != null) {

            val copy = map[current]!!

            copy.next = map[current.next]
            copy.random = map[current.random]

            current = current.next
        }

        return map[node]
    }
}
