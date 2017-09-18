package solutions.leetcode;

import java.util.List;

import base.Solution;
import base.TestCases;
import structures.TwoComposite;
import testcases.leetcode.FindSubStringFromWordsTestCases;

public class FindSubStringFromWords extends Solution<TwoComposite<String, String[]>, List<Integer>> {

    @Override
    protected List<Integer> runTest(TwoComposite<String, String[]> input) {
        return this.findSubstring(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(List<Integer> output) {
        System.out.println(output.toString());
    }

    @Override
    protected void testOutput(List<Integer> outputTest, List<Integer> output) {
       
    }

    @Override
    protected TestCases<TwoComposite<String, String[]>, List<Integer>> genTestCases() {
        return new FindSubStringFromWordsTestCases();
    }

    public List<Integer> findSubstring(String s, String[] words) {
        
    }
}
