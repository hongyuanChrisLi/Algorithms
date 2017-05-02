package solutions.leetcode;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import base.Solution;
import structures.TreeNode;

public class UniqueBinarySearchTreeII extends Solution<Integer, List<TreeNode>> {

    @Override
    protected List<TreeNode> runTest(Integer input) {
        return generateTrees(input);
    }

    @Override
    protected void printOutputData(List<TreeNode> output) {
        System.out.println(output.size());
    }

    @Override
    protected void testOutput(List<TreeNode> outputTest, List<TreeNode> output) {
        List<String> testTreeStrLst = new ArrayList<String>();
        for(TreeNode testNode : outputTest)
            testTreeStrLst.add(testNode.toString("", true));
        
        assertTrue(output.size() > 0);
        
        for(TreeNode node: output) {
            String treeStr = node.toString("", true);
            assertTrue(testTreeStrLst.contains(treeStr));
        }
        
    }
    
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        res.add(new TreeNode(1));
        return res ;
    }

}
