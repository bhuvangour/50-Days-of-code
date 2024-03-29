package Day56;
import java.util.*;
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode preHead = new ListNode(-1);
        ListNode cur = preHead;

        while (list1 != null && list2 != null) {
            
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } 
            
            else {
                cur.next = list2;
                list2 = list2.next;
            }
            
            cur = cur.next;
        }

        cur.next = list1 == null ? list2 : list1;
        
        return preHead.next;
        
    } 
}
