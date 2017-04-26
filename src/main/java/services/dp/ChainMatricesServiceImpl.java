package services.dp;

import java.util.List;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.dp.ChainMatricesBtmUp;
import solutions.dp.ChainMatricesTopDwn;
import testcases.dp.ChainMatricesTestCases;


public class ChainMatricesServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<int[], List<List<Integer>>> testCases = new ChainMatricesTestCases();

        Solution<int[], List<List<Integer>>> solution = new ChainMatricesBtmUp();
        solution.runTests(testCases);
        
        solution = new ChainMatricesTopDwn();
        solution.runTests(testCases);

    }

}
