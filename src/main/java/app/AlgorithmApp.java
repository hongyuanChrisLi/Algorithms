package app;

import java.util.Scanner;

import base.SolutionService;

public class AlgorithmApp {
    
    private static final int INVALID_CHOICE = -1;
    private LeetCodeServiceClassMap leetMap = new LeetCodeServiceClassMap();
    private MiscServiceClassMap miscMap = new MiscServiceClassMap();

    private void printDesc(){
        String leetLatest = leetMap.getLastest();
        System.out.println("=== LeetCode Solutions ===");
        System.out.println("\tTotal: " + leetMap.getTotStr() + " | Max: " + leetMap.getMaxNumStr());
        System.out.println("\tLatest No. " + leetLatest +  " ==> " + leetMap.get(leetLatest).getName());
        
        String miscLatest = miscMap.getLatest();
        System.out.println("=== Misc Solutions ===");
        System.out.println("\tlatest No. " + miscLatest + " ==> " + miscMap.get(miscLatest).getName());
        
        System.out.println("\nPlease select a solution to test:");
    }
    
    private String getChoice() {
       
        printDesc();
        Scanner sc = new Scanner(System.in);
        String choice = sc.next().trim();
        sc.close();
        
        return choice;
    }
    
    public Class<? extends SolutionService> userClassChoice(){
        
        String choice = getChoice();

        if (leetMap.containsKey(choice)){
            System.out.println("You chose: " + this.leetMap.get(choice).getName());
            return this.leetMap.get(choice);
        } else if (miscMap.containsKey(choice)){
            System.out.println("You chose: " + this.miscMap.get(choice).getName());
            return this.miscMap.get(choice);
        } 
        
        System.out.println("Invalid Choice");
        return null;
    }

    public static void main(String[] args) {
        AlgorithmApp app = new AlgorithmApp();
        Class<? extends SolutionService> solutionServiceClass = app.userClassChoice();
       
        if (solutionServiceClass == null) {
            System.exit(INVALID_CHOICE);
        }
        
        SolutionService solutionService;
        try {
            solutionService = solutionServiceClass.newInstance();
            solutionService.run();
        } catch (InstantiationException e) {
            excetpMsg("InstantiationException", e);
        } catch (IllegalAccessException e) {
            excetpMsg("IllegalAccessException", e);
        }
    }
    
    private static void excetpMsg(String msg, Exception e){
        System.out.println("Failed to instantiate: " + msg);
        System.out.println(e.getMessage());
    }

}
