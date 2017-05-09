package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import base.Solution;
import base.TestCases;
import testcases.leetcode.PhoneNumToLettersTestCases;

/*
 * 
https://leetcode.com/problems/letter-combinations-of-a-phone-number/#/description

Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.


Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 * 
 * */

public class PhoneNumToLetters extends Solution<String, List<String>> {

    @Override
    protected List<String> runTest(String input) {
        return this.letterCombinations(input);
    }

    @Override
    protected void printOutputData(List<String> output) {
        System.out.println(output.toString());
    }

    @Override
    protected void testOutput(List<String> outputTest, List<String> output) {
        Set<String> setTest = new HashSet<String>(outputTest);
        Set<String> setOutput = new HashSet<String>(output);
        assertEquals(setTest, setOutput);
    }

    @Override
    protected TestCases<String, List<String>> genTestCases() {
        return new PhoneNumToLettersTestCases();
    }
    
    public List<String> letterCombinations(String digits) {
        
        String[][] numLetMap = {
                {},
                {},
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o"},
                {"p", "q", "r", "s"},
                {"t", "u", "v"},
                {"w", "x", "y", "z"}
        };
        
        int[] lenLkp = {0, 0, 3, 3, 3, 3, 3, 4, 3, 4};
        LinkedList<String> resLst = new LinkedList<String>();
        int digitsLen = digits.length();
        if (digitsLen < 1) return resLst;
        
        resLst.add("");
        for (int i = 0; i < digitsLen; i++ ){
            int resStartLen = resLst.size();
            int num = digits.charAt(i) - '0';
            while(resStartLen-- > 0) {
                String str = resLst.pollFirst();
                for (int j = 0; j < lenLkp[num]; j++ ){
                    //System.out.printf("%d, %d, %d, %d\n", i,j, num, lenLkp[num]);
                    resLst.offerLast(str + numLetMap[num][j]);
                }
            }
        }
        return resLst;
    }
    
}
