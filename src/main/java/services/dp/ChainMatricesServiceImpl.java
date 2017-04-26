package services.dp;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.dp.ChainMatricesBtmUp;
import testcases.dp.ChainMatricesTestCases;


public class ChainMatricesServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<int[], int[]> testCases = new ChainMatricesTestCases();

        Solution<int[], int[]> solution = new ChainMatricesBtmUp();
        solution.runTests(testCases);

    }

}
