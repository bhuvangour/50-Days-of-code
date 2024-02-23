package Day56;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode currentHead = head;

        while (currentHead != null && currentHead.next != null) {
            
            if (currentHead.val == currentHead.next.val) {
                currentHead.next = currentHead.next.next;
            } else {
                currentHead = currentHead.next;
            }
        }

        return head;
        
    }
}
