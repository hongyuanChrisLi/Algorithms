package testcases.leetcode;

import java.util.ArrayList;
import java.util.List;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;
import structures.TreeNode;

public class UniqueBinarySearchTreeIITestCases extends TestCases<Integer, List<TreeNode>>
        implements TestCaseHandler<Integer, List<TreeNode>> {

    private static final long serialVersionUID = 9192056172808040020L;
    
    public UniqueBinarySearchTreeIITestCases(){
        addTestCase("Test N = 3", 3, buildResN3());
    }

    @Override
    public boolean addTestCase(String name, Integer input, List<TreeNode> output) {
        return this.add(new TestCase<Integer, List<TreeNode>>(name, input, output));
    }
    
    private List<TreeNode> buildResN3(){
        
        List<TreeNode> bst = new ArrayList<TreeNode>();
        List<TreeNode> nodes;
        
        nodes = genNodes(3);
        nodes.get(1).right = nodes.get(2);
        nodes.get(0).right = nodes.get(1);
        bst.add(nodes.get(0));
        nodes.get(0).print("", true);
        
        
        nodes = genNodes(3);
        nodes.get(2).left = nodes.get(1);
        nodes.get(0).right = nodes.get(2);
        bst.add(nodes.get(0));
        nodes.get(0).print("", true);
        
        nodes = genNodes(3);
        nodes.get(1).left = nodes.get(0);
        nodes.get(1).right = nodes.get(2);
        bst.add(nodes.get(1));
        nodes.get(1).print("", true);
        
        
        nodes = genNodes(3);
        nodes.get(1).left = nodes.get(0);
        nodes.get(2).left = nodes.get(1);
        bst.add(nodes.get(2));
        nodes.get(2).print("", true);
        
        
        nodes = genNodes(3);
        nodes.get(0).right = nodes.get(1);
        nodes.get(2).left = nodes.get(0);
        bst.add(nodes.get(2));
        
        return bst;
    }
    
    
    private List<TreeNode> genNodes(int n) {
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        
        for (int i = 0; i < n; i ++ )
            nodes.add(i, new TreeNode(i+1));
        
        return nodes;
    }

}
