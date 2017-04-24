package solutions.leetcode;
import structures.ListNode;

public class AddTwoListNodeNumsOptimized extends AddTwoListNodeNums {

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head, tail;
        int carryOver = 0;
        int sum = 0;

        if (l1 != null) {
            head = l1;
        } else if (l2 != null) {
            head = l2;
        } else
            return null;
        tail = head;

        while (l1 != null || l2 != null) {
            sum = carryOver;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            } 

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            } 

            carryOver = sum / 10;
            tail.val = sum % 10;

            if (l1 == null && l2 != null)
                tail.next = l2;

            if (carryOver == 0) {
                if (l1 == null || l2 == null)
                    break;
            } else if (tail.next == null) {
                tail.next = new ListNode(carryOver);
            } 
            
            tail = tail.next;
        }

        return head;
    }
}
