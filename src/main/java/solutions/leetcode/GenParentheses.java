package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
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
        System.out.println(output.toString());
    }

    @Override
    protected void testOutput(List<String> outputTest, List<String> output) {
        assertEquals(outputTest.size(), output.size());
        output.removeAll(outputTest);
        assertEquals(0, output.size());
    }

    @Override
    protected TestCases<Integer, List<String>> genTestCases() {
        return new GenParenthesesTestCases();
    }

    public List<String> generateParenthesis(int n) {
        return new ArrayList<String>();
    }
    
}
