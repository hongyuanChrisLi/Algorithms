package testcases.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class GenParenthesesTestCases extends TestCases<Integer, List<String>>
        implements TestCaseHandler<Integer, String[]> {

    private static final long serialVersionUID = -2588654738776819319L;

    public GenParenthesesTestCases(){
        addTestCase("Test Example", 3, 
                new String[]{"((()))","(()())","(())()","()(())","()()()"});
        
    }
    
    @Override
    public boolean addTestCase(String name, Integer input, String[] output) {
        return this.add(new TestCase<Integer, List<String>>(
                name, 
                input, 
                new ArrayList<String>(Arrays.asList(output))));
    }

}
