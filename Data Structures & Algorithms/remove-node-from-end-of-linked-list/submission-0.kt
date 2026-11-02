/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

        val dummy = ListNode(0)
        dummy.next = head

        var slow = dummy
        var fast = dummy

        // Move fast n steps ahead
        repeat(n) {
            fast = fast.next!!
        }

        // Move both pointers together
        while (fast.next != null) {
            slow = slow.next!!
            fast = fast.next!!
        }

        // Remove the nth node
        slow.next = slow.next?.next

        return dummy.next
    }
}