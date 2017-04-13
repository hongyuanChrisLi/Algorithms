package app;

import services.SolutionService;
import services.TwoSumServiceImpl;

public class Main {
    public static void main(String[] args) {
       SolutionService solutionService = new TwoSumServiceImpl();
       solutionService.run();
    }
}
