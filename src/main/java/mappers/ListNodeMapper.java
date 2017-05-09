package mappers;

import structures.ListNode;

public class ListNodeMapper {

    public static ListNode toListNode(int num) {
        ListNode headNode = null, tailNode = null;

        while (num > 0) {
            ListNode node = new ListNode(num % 10);

            if (headNode == null) {
                headNode = node;
                tailNode = headNode;
            } else {
                tailNode.next = node;
                tailNode = node;
            }
            num = num / 10;
        }
        return headNode;
    }

    public static ListNode toListNode(int[] numList) {
        
        int lstLen = numList.length;
        
        if (lstLen == 0) {
            return null;
        }
        
        ListNode head = new ListNode(numList[lstLen - 1]);
        
        for ( int i = lstLen - 2; i >= 0; i--) {
            ListNode node = new ListNode(numList[i]);
            node.next = head;
            head = node;
        }
        
        return head;
    }

    public static String toString(ListNode listNode) {

        String nodeStr = "";
        ListNode curNode = listNode;
        while (curNode != null) {
            nodeStr += Integer.toString(curNode.val) + " -> ";
            curNode = curNode.next;
        }
        return nodeStr;
    }

}
