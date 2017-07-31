package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import java.util.Stack;
import structures.TwoComposite;
import testcases.leetcode.RmKElemsTestCases;

/*
Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

Note:
The length of num is less than 10002 and will be ≥ k.
The given num does not contain any leading zero.

*/


public class RmKElmes extends Solution<TwoComposite<String, Integer>, String> {

  @Override
  protected String runTest(TwoComposite<String, Integer> input) {
    return this.removeKdigits(input.var1, input.var2);
  }

  @Override
  protected void printOutputData(String output) {
    System.out.println(output);
  }

  @Override
  protected void testOutput(String outputTest, String output) {
    assertEquals(outputTest,output);
  }

  @Override
  protected TestCases<TwoComposite<String, Integer>, String> genTestCases() {
    return new RmKElemsTestCases();
  }

  public String removeKdigits(String num, int k){

    int digits = num.length() - k;
    char[] stk = new char[num.length()];
    int top = 0;

    for (int i = 0; i < num.length(); i++){
      char c = num.charAt(i);

      while (top > 0 && stk[top - 1] > c && k > 0){
        top -= 1;
        k -= 1;
      }
      stk[top++] = c;
      //System.out.println(top);
      //System.out.println(stk);
    }

    int btm = 0;
    while ( btm < digits && stk[btm] == '0' ) btm += 1;
    return btm == digits?  "0" : new String(stk, btm, digits - btm);
  }

  public String removeKdigitsV1(String num, int k) {

    Stack<Character> stk = new Stack<Character>();
    int n = num.length();

    /*for (int i=0; i<n-k; i++)
      stk.push(num.charAt(i));*/

    for (int i=0; i<n; i++ ){

      while(!stk.empty() && stk.peek() > num.charAt(i) && stk.size() + k > i) {
        stk.pop();
      }

      if (stk.size() < n - k){
        if (num.charAt(i) == '0' && stk.empty()) continue;
        stk.push(num.charAt(i));
      }


      System.out.println(stk.toString());
    }

    int m = stk.size();
    if (m==0) return "0";

    char[] nums = new char[m];
    int idx = m - 1;

    while ( !stk.empty()){
      nums[idx] = stk.pop();
      idx -= 1;
    }

    return new String(nums);
  }

}
