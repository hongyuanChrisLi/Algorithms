package services.dp;

import java.util.List;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.dp.KnapsackBtmUp;
import solutions.dp.KnapsackTopDwn;
import structures.TwoComposite;
import testcases.dp.KnapsackTestCases;

public class KnapsackServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<TwoComposite<int[][], Integer>, List<Integer>> testCases = new KnapsackTestCases();

        Solution<TwoComposite<int[][], Integer>, List<Integer>> solution = new KnapsackBtmUp();
        solution.runTests(testCases);
        
        solution = new KnapsackTopDwn();
        solution.runTests(testCases);
    }

}
