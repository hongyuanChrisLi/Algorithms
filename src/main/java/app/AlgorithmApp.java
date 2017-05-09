package app;

import java.util.List;
import java.util.Scanner;

import base.GenericSolutionService;
import base.Solution;

public class AlgorithmApp {
    
    private static final int INVALID_CHOICE = -1;
    private LeetCodeSolutionClassMap leetMap = new LeetCodeSolutionClassMap();
    private MiscSolutionClassMap miscMap = new MiscSolutionClassMap();

    private void printDesc(){
        String leetLatest = leetMap.getLastest();
        System.out.println("=== LeetCode Solutions ===");
        System.out.println("\tTotal: " + leetMap.getTotStr() + " | Max: " + leetMap.getMaxNumStr());
        System.out.println("\tAvailable choices: " + leetMap.getNumRange());
        System.out.println("\tLatest No. " + leetLatest +  " ==> " + leetMap.get(leetLatest).toString());
        
        String miscLatest = miscMap.getLatest();
        System.out.println("=== Misc Solutions ===");
        System.out.println("\tlatest No. " + miscLatest + " ==> " + miscMap.get(miscLatest).toString());
        
        System.out.println("\nPlease select a solution to test:");
    }
    
    private String getChoice() {
       
        printDesc();
        Scanner sc = new Scanner(System.in);
        String choice = sc.next().trim();
        sc.close();
        
        return choice;
    }
    
    public List<Class<? extends Solution<?,?>>> userClassChoice(){
        
        String choice = getChoice();

        if (leetMap.containsKey(choice)){
            System.out.println("\nYou chose: " + this.leetMap.get(choice).toString());
            return this.leetMap.get(choice);
        } else if (miscMap.containsKey(choice)){
            System.out.println("\nYou chose: " + this.miscMap.get(choice).toString());
            return this.miscMap.get(choice);
        } 
        return null;
    }

    public static void main(String[] args) {
        AlgorithmApp app = new AlgorithmApp();
        List<Class<? extends Solution<?,?>>> solutionClasses = app.userClassChoice();
       
        if (solutionClasses == null) {
            System.out.println("Invalid Choice");
            System.exit(INVALID_CHOICE);
        }
        
        GenericSolutionService.run(solutionClasses);
    }
    


}
