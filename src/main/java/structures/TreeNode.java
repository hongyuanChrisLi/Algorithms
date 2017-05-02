package structures;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
    
    public void print() {
        System.out.print(toString("", true));
    }
    
    public String toString(String prefix, boolean isTail) {
        
        String res = "";
        
        res += prefix + (isTail ? "└── " : "├── ") + Integer.toString(val) + "\n";
        
        if ( left != null)
            res += left.toString(prefix + (isTail ? "    " : "│   "), false);    
        else if (right != null)
            res += prefix + (isTail ? "    " : "│   ") + "├── L(null)\n" ;
        
        if ( right != null) 
            res += right.toString(prefix + (isTail ? "    " : "│   "), true);
        else if (left != null)
            res += prefix + (isTail ? "    " : "│   ") + "└── R(null)\n" ;      
    
        return res;
    }
}
