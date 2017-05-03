package services.leetcode;

import base.SolutionService;
import base.TestCases;
import solutions.leetcode.RegexMatch;
import structures.TwoComposite;
import testcases.leetcode.RegexMatchTestCases;

public class RegexMatchServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<TwoComposite<String, String>, Boolean> testCases = new RegexMatchTestCases();
        new RegexMatch().runTests(testCases);
    }

}
