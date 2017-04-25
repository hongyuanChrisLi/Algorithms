package services.dp;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.dp.KnapsackBtmUp;
import structures.TwoComposite;
import testcases.dp.KnapsackTestCases;

public class KnapsackServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<TwoComposite<int[][], Integer>, int[]> testCases = new KnapsackTestCases();

        Solution<TwoComposite<int[][], Integer>, int[]> solution = new KnapsackBtmUp();
        solution.runTests(testCases);
    }

}
