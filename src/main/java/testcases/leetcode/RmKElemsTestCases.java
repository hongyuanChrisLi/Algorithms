package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;


public class RmKElemsTestCases extends TestCases<TwoComposite<String,Integer>, String>
    implements TwoCompositeTestCaseHandler<String, Integer, String>{

  public RmKElemsTestCases (){
    this.addTestCase("Test 1", "1432219", 3, "1219");
    this.addTestCase("Test 2", "134541872", 5, "1172");
    this.addTestCase("Test 3", "10200", 1, "200");
    this.addTestCase("Test 4", "10", 2, "0");
    this.addTestCase("Test 5", "99810020233", 4, "20233");
    this.addTestCase("Test 6", "0", 0, "0");
    this.addTestCase("Test 7", "9", 1, "0");
    this.addTestCase("Test 8", "112", 1, "11");
  }

  @Override
  public boolean addTestCase(String name, String input1, Integer input2, String output) {
    return this.add(
        new TestCase<TwoComposite<String, Integer>, String>(
            name,
            new TwoComposite<String, Integer>(input1, input2),
            output)
    );
  }
}
