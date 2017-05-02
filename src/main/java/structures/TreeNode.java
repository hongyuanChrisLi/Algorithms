package structures;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
    
    
    public void print(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + Integer.toString(val));
        if ( left != null)
            left.print(prefix + (isTail ? "    " : "│   "), false);    
        else
            System.out.println(prefix + (isTail ? "    " : "│   ") + "└── L(null)" );
        
        if ( right != null) 
            right.print(prefix + "    ", true);
        else
            System.out.println(prefix + (isTail ? "    " : "│   ") + "└── R(null)" );
            
    }
}
