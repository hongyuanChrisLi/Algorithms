package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import base.Solution;
import base.TestCases;
import testcases.leetcode.GenParenthesesTestCases;

/*
 * 
https://leetcode.com/problems/generate-parentheses/#/description

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 * 
 * */

public class GenParentheses extends Solution<Integer, List<String>> {

    @Override
    protected List<String> runTest(Integer input) {
        return generateParenthesis(input);
    }

    @Override
    protected void printOutputData(List<String> output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(List<String> outputTest, List<String> output) {
        assertEquals(outputTest.size(), output.size());
        List<String> tmpList = new ArrayList<String>(output);
        tmpList.removeAll(outputTest);
        assertEquals(0, tmpList.size());
    }

    @Override
    protected TestCases<Integer, List<String>> genTestCases() {
        return new GenParenthesesTestCases();
    }
    
    public List<String> generateParenthesis(int n){
        
        List<String> res = new ArrayList<String>();
        dfs(res, "", n, n);
        
        return res;
    }
    
    private void dfs(List<String> res, String s, int left, int right){
        
        if ( left == 0 && right == 0) res.add(s);
        if ( left > 0) dfs(res, s + '(', left - 1, right);
        if ( right > left ) dfs(res, s + ')', left, right - 1);
    }

/*    public List<String> generateParenthesis(int n) {
        
        LinkedList<String> res = new LinkedList<String>();
        LinkedList<List<Integer>> meta = new LinkedList<List<Integer>>();
        
        res.add("");
        meta.add(Arrays.asList(n, n));
        
        for (int i = 0; i < n * 2; i++ ){
            int len = res.size();
            while(len > 0){
                String base = res.pollFirst();
                List<Integer> baseMeta = meta.pollFirst();
                int availLeft = baseMeta.get(0);
                int availRight = baseMeta.get(1);
                
                if ( availLeft > 0){
                    res.add(base + "(");
                    meta.add(Arrays.asList(availLeft - 1, availRight));
                }
                
                if ( availLeft < availRight ){
                    res.add(base + ")");
                    meta.add(Arrays.asList(availLeft, availRight - 1));
                }
                len --;
            }
        }
        return res;
    }*/
    
}
