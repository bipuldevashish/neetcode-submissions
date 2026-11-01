/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reorderList(head: ListNode?) {

        if (head?.next == null) return

        // Step 1: Find the middle of the linked list
        var slow = head
        var fast = head

        while (fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        // Step 2: Split the list into two halves
        var second = slow?.next
        slow?.next = null

        // Step 3: Reverse the second half
        var prev: ListNode? = null
        var current = second

        while (current != null) {
            val nextNode = current.next
            current.next = prev
            prev = current
            current = nextNode
        }

        // Step 4: Merge both halves
        var first = head
        second = prev

        while (second != null) {
            val temp1 = first?.next
            val temp2 = second.next

            first?.next = second
            second.next = temp1

            first = temp1
            second = temp2
        }
    }
}
