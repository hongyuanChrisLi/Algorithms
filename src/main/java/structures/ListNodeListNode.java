package structures;

import mappers.ListNodeMapper;

public class ListNodeListNode {
    public ListNode listNodeA;
    public ListNode listNodeB;
    
    public ListNodeListNode(ListNode listNodeA, ListNode listNodeB){
        this.listNodeA = listNodeA;
        this.listNodeB = listNodeB;
    }
    
    public ListNodeListNode(int a, int b){
        this.listNodeA = ListNodeMapper.toListNode(a);
        this.listNodeB = ListNodeMapper.toListNode(b);
    }
}
    