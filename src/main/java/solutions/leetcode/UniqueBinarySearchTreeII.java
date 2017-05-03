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
    
    //private TreeNode[][] chainNodes;    // left points to tree Nodes, 
                                        //right points to next chainNode
    
    public List<TreeNode> generateTrees(int n) {
        
        if ( n < 1 )
            return new ArrayList<TreeNode>();
        
        TreeNode[][] chainNodes = new TreeNode[n+2][n+2];
        
        for (int i = 0; i < n+2; i ++)
            for (int j =0; j < n+2; j++)
                chainNodes[i][j] = new TreeNode(0);
        
        List<TreeNode> res = new ArrayList<TreeNode>();
        
        for (int i = n; i > 0; i --){
            chainNodes[i][i].left = new TreeNode(i);
                for (int j = i + 1; j <= n; j ++) {
                    TreeNode curChainNode = chainNodes[i][j];
                    for ( int k = i; k <= j; k ++){
                        
                        TreeNode leftChain = chainNodes[i][k-1];
                        TreeNode rightChain = chainNodes[k+1][j];
                        
                        while (leftChain != null && leftChain.val == 0){
                            TreeNode curRightChain = rightChain;
                            while (curRightChain != null && curRightChain.val == 0) {
                                
                                TreeNode root = new TreeNode(k);
                                root.left = leftChain.left;
                                root.right = curRightChain.left;
                                
                                curChainNode.left = root;
                                curChainNode.val = 0;
                                curChainNode.right = new TreeNode(-1);
                                
                                curChainNode = curChainNode.right;
                                curRightChain = curRightChain.right;
                            }
                            leftChain = leftChain.right;
                        }
                    }
                }
        }
        
        TreeNode curChain = chainNodes[1][n];
        while (curChain != null && curChain.val == 0){
            res.add(curChain.left);
            curChain = curChain.right;
        }
        
        return res ;
    }
    
}
