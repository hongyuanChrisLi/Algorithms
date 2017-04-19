package app;

import java.util.Scanner;

import base.SolutionService;

public class AlgorithmApp {
    
    private static final int INVALID_CHOICE = -1;
    private ServiceClassList svcClassLst = new ServiceClassList();

    private int pickSolutionToTest() {
        int lstLen = this.svcClassLst.size();
        
        System.out.println("Last solution ==> " + this.svcClassLst.get(lstLen-1).getName());
        System.out.println("Please select a solution to test: [ 0 - " + Integer.toString(lstLen - 1) + " ]");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();
        
        if (choice >= 0 && choice < lstLen){
            System.out.println("You chose: " + this.svcClassLst.get(choice).getName());
            return choice;
        }
        
        System.out.println("Invalid choice");
        return INVALID_CHOICE;
    }
    
    public Class<? extends SolutionService> userClassChoice(){
        int choice = pickSolutionToTest();
        
        if ( choice == INVALID_CHOICE ){
            System.exit(INVALID_CHOICE);
        }
        
        return svcClassLst.get(choice);
    }

    public static void main(String[] args) {
        AlgorithmApp app = new AlgorithmApp();
        Class<? extends SolutionService> solutionServiceClass = app.userClassChoice();
       
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
