package mappers;

import structures.ListNode;

public class ListNodeMapper {
    
    public static ListNode toListNode(int num){
        ListNode headNode = null;
       
        while (num > 0) {
            ListNode node = new ListNode(num % 10);
            node.next = headNode;
            headNode = node;
            num = num / 10;
        }
        return headNode;
    }
    
     public static String toString(ListNode listNode){
            
            String nodeStr = "";
            ListNode curNode = listNode;
            while ( curNode != null) {
                nodeStr += Integer.toString(curNode.val) + " -> ";
                curNode = curNode.next;
            } 
            return nodeStr;
        }  
    
}
